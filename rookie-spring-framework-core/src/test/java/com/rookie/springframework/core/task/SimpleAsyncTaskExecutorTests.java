package com.rookie.springframework.core.task;

import org.junit.jupiter.api.Test;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.util.ConcurrencyThrottleSupport;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

/**
 * @Class SimpleAsyncTaskExecutorTests
 * @Description
 * @Author rookie
 * @Date 2024/6/28 9:07
 * @Version 1.0
 */
class SimpleAsyncTaskExecutorTests {

    @Test
    void cannotExecuteWhenConcurrencyIsSwitchedOff() {
        try (SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor()) {
            executor.setConcurrencyLimit(ConcurrencyThrottleSupport.NO_CONCURRENCY);
            assertThat(executor.isThrottleActive()).isTrue();
            assertThatIllegalStateException().isThrownBy(() -> executor.execute(new NoOpRunnable()));
        }
    }

    @Test
    void throttleIsNotActiveByDefault() {
        try (SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor()) {
            assertThat(executor.isThrottleActive()).as("Concurrency throttle must not default to being active (on)").isFalse();
        }
    }

    @Test
    void threadNameGetsSetCorrectly() {
        final String customPrefix = "chankPop#";
        final Object monitor = new Object();
        SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor(customPrefix);
        ThreadNameHarvester task = new ThreadNameHarvester(monitor);
        executeAndWait(executor, task, monitor);
        assertThat(task.getThreadName()).startsWith(customPrefix);
    }

    @Test
    void threadFactoryOverridesDefaults() {
        final Object monitor = new Object();
        SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor(runnable -> new Thread(runnable, "test"));
        ThreadNameHarvester task = new ThreadNameHarvester(monitor);
        executeAndWait(executor, task, monitor);
        assertThat(task.getThreadName()).isEqualTo("test");
    }

    @Test
    void throwsExceptionWhenSuppliedWithNullRunnable() {
        try (SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor()) {
            assertThatIllegalArgumentException().isThrownBy(() -> executor.execute(null));
        }
    }

    private void executeAndWait(SimpleAsyncTaskExecutor executor, Runnable task, Object monitor) {
        synchronized (monitor) {
            executor.execute(task);
            try {
                monitor.wait();
            }
            catch (InterruptedException ignored) {
            }
        }
    }


    private static final class NoOpRunnable implements Runnable {

        @Override
        public void run() {
            // no-op
        }
    }


    private abstract static class AbstractNotifyingRunnable implements Runnable {

        private final Object monitor;

        protected AbstractNotifyingRunnable(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public final void run() {
            synchronized (this.monitor) {
                try {
                    doRun();
                }
                finally {
                    this.monitor.notifyAll();
                }
            }
        }

        protected abstract void doRun();
    }


    private static final class ThreadNameHarvester extends AbstractNotifyingRunnable {

        private String threadName;

        protected ThreadNameHarvester(Object monitor) {
            super(monitor);
        }

        public String getThreadName() {
            return this.threadName;
        }

        @Override
        protected void doRun() {
            this.threadName = Thread.currentThread().getName();
        }
    }

}

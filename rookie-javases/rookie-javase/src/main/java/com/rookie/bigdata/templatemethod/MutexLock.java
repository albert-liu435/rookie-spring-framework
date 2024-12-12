package com.rookie.bigdata.templatemethod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Class MutexLock
 * @Description 互斥锁
 * @Author rookie
 * @Date 2024/12/12 18:10
 * @Version 1.0
 */
public class MutexLock implements Lock {

    private final Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(0);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }

    final static class Sync extends AbstractQueuedSynchronizer {
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, arg)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            } else {
                return false;
            }

        }

        @Override
        protected boolean tryRelease(int arg) {
            if (compareAndSetState(1, arg)) {
                setExclusiveOwnerThread(null);
                return true;
            } else {
                return false;
            }
        }

        Condition newCondition() {
            return new ConditionObject();
        }
    }
}

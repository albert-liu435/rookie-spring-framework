package com.rookie.bigdata.designpatterns.templatemethod;

import com.rookie.bigdata.designpatterns.templatemethod.MutexLock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;


/**
 * @Class MutexLockTest
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:12
 * @Version 1.0
 */
class MutexLockTest {

    private static int f = 0;

    @Test
    void lock() throws InterruptedException {
        Lock lock = new MutexLock();
        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU Cores :"+threadCount);
        CountDownLatch signal = new CountDownLatch(threadCount);
        int loop = 100000;
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(() -> {
                int l = 0;
                while (l < loop) {
                    lock.lock();
                    try {
                        f++;
                    } catch (Exception e) {

                    } finally {
                        lock.unlock();
                    }
                    l++;
                }
                signal.countDown();
            });
            thread.start();
        }
        signal.await();
        Assertions.assertEquals(threadCount * loop, f);
    }

}

package com.rookie.bigdata.designpatterns.observer.myob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ProducerTest
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:20
 * @Version 1.0
 */
class ProducerTest {

    @Test
    void myOb() {
        Producer producer1 = new Producer();
        Producer producer2 = new Producer();
        Consumer1 consumer1 = new Consumer1();
        Consumer2 consumer2 = new Consumer2();

        producer1.addConsumer(consumer1);
        producer1.addConsumer(consumer2);
        producer2.addConsumer(consumer1);
        producer2.addConsumer(consumer2);

        producer1.notifyConsumer("我是生产者1，我现在给你们通知一条消息，收到赶紧去消费掉");
        producer2.notifyConsumer("我是生产者2，我现在给你们通知一条消息，收到赶紧去消费掉");
    }

}

package com.rookie.bigdata.designpatterns.observer.myob;

/**
 * @Class Consumer1
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:20
 * @Version 1.0
 */
public class Consumer1 implements Consumer {

    /**
     * 消费
     *
     * @param producer 生产者
     * @param message  消息
     */
    public void consume(Producer producer, Object message) {
        System.out.println("我是 consumer1 我收到了" + producer + "的通知，通知内容：" + message);
    }
}


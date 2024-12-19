package com.rookie.bigdata.designpatterns.observer.myob;

/**
 * @Class Consumer
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:20
 * @Version 1.0
 */
public interface Consumer {

    /**
     * 消费
     *
     * @param producer 生产者
     * @param message  消息
     */
    void consume(Producer producer, Object message);
}


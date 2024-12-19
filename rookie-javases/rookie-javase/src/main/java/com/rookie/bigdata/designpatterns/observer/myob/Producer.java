package com.rookie.bigdata.designpatterns.observer.myob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Class Producer
 * @Description 一个简单的 Producer
 * @Author rookie
 * @Date 2024/12/19 11:19
 * @Version 1.0
 */
public class Producer {

    private final List<Consumer> consumers;

    public Producer() {
        consumers = Collections.synchronizedList(new ArrayList<>());
    }

    public void addConsumer(Consumer consumer) {
        if (!consumers.contains(consumer)) {
            consumers.add(consumer);
        }
    }

    public void notifyConsumer() {
        this.notifyConsumer(null);
    }

    public void notifyConsumer(Object message) {
        consumers.forEach(consumer -> consumer.consume(this, message));
    }
}


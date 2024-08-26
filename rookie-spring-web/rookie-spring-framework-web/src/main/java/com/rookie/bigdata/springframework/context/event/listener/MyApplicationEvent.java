package com.rookie.bigdata.springframework.context.event.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Class MyApplicationEvent
 * @Description 事件类型
 * @Author rookie
 * @Date 2024/8/26 11:01
 * @Version 1.0
 */
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}

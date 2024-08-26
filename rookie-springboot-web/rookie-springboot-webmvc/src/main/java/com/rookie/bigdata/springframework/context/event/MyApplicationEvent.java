package com.rookie.bigdata.springframework.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Class MyApplicationEvent
 * @Description 事件类型
 * @Author rookie
 * @Date 2024/8/26 9:30
 * @Version 1.0
 */
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}

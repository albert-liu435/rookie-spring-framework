package com.rookie.bigdata.springframework.context.event.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Class MyAnnotationEventListener
 * @Description
 * @Author rookie
 * @Date 2024/8/26 11:05
 * @Version 1.0
 */
@Slf4j
@Component
public class MyAnnotationEventListener {

    /**
     * 在方法上添加@EventListener注解实现监听功能；其中：@EventListener(ObjectEvent.class)可以简化为@EventListener。相比接口使用方式，注解监听的类型不需要继承ApplicationEvent(可以是任意类型)。
     *
     * @param objectEvent
     */
    @EventListener(ObjectEvent.class)
    public void onObjectEvent(ObjectEvent objectEvent) {
        log.info("[Annotation] event is {}.", objectEvent);
    }
}

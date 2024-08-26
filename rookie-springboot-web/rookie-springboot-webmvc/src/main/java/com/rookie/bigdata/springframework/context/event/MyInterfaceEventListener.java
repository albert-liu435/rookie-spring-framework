package com.rookie.bigdata.springframework.context.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Class MyInterfaceEventListener
 * @Description 基于ApplicationListener接口方式。监听器需要显式实现ApplicationListener接口以及指定事件类型，并实现onApplicationEvent接口
 * @Author rookie
 * @Date 2024/8/26 9:29
 * @Version 1.0
 */
@Slf4j
@Component
public class MyInterfaceEventListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        log.info("[Interface] event is {}.", event);
    }
}

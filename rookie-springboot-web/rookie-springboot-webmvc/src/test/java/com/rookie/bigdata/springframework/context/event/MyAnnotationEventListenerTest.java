package com.rookie.bigdata.springframework.context.event;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyAnnotationEventListenerTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 9:35
 * @Version 1.0
 */
@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("dev")
@Slf4j
class MyAnnotationEventListenerTest {
    @Autowired
    private ApplicationEventPublisher publisher;

    @Test
    void onObjectEvent() {

        ObjectEvent objectEvent=new ObjectEvent();
        objectEvent.setName("test-object-event-1");

        publisher.publishEvent(objectEvent);
        publisher.publishEvent(new MyApplicationEvent("test-application-event-2"));
    }
}

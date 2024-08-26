package com.rookie.bigdata.springframework.context.event.listener;

import com.rookie.bigdata.springframework.context.lifecycle.circulate.CirculateConfig;
import com.rookie.bigdata.springframework.context.lifecycle.circulate.ComponentA;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class EventConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/8/26 11:03
 * @Version 1.0
 */
@Slf4j
class EventConfigTest {



    @SneakyThrows
    @Test
    void testListener(){
        //容器执行流程
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);


        context.publishEvent(new MyApplicationEvent("hello"));

        context.publishEvent(new ObjectEvent());

//        log.info("ComponentA: {}", componentA);
        Thread.sleep(10000);

//        context.close();
    }

}

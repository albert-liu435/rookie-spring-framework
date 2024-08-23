package com.rookie.bigdata.springframework.context.lifecycle.circulate;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Class CirculateConfigTest
 * @Description
 * @Author rookie
 * @Date 2024/8/23 15:56
 * @Version 1.0
 */
@Slf4j
class CirculateConfigTest {

    @Test
    void testCirculate() {

        //容器执行流程
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CirculateConfig.class);

        //        //通过IOC容器的setAllowCircularReferences方法关闭IOC容器的循环依赖能力，
//        ((DefaultListableBeanFactory)context.getBeanFactory()).setAllowCircularReferences(true);

//        ComponentA bean = context.getBean(ComponentA.class);
        ComponentA componentA = (ComponentA)context.getBean("componentA");

        log.info("ComponentA: {}", componentA);


    }


}

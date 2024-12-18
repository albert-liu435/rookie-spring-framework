package com.rookie.bigdata.designpatterns.state.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ContextTest
 * @Description
 * @Author rookie
 * @Date 2024/12/18 18:42
 * @Version 1.0
 */
class ContextTest {


    @Test
    void test01(){
        //创建实现类对象（健康的啊坤）
        HealthState healthState = new HealthState();

        //创建实现类对象（骨折的啊坤）
        FractureState fractureState = new FractureState();

        //通过给环境传入不同的对象，执行不同的方法(传入一个健康的阿坤)
        Context healthContext = new Context(healthState);
        healthContext.request();

        //通过给环境传入不同的对象，执行不同的方法(传入一个骨折的阿坤)
        Context fractureContext = new Context(fractureState);
        fractureContext.request();
    }

}

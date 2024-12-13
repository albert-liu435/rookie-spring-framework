package com.rookie.bigdata.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class SmartAppliancesFacadeTest
 * @Description https://blog.csdn.net/zht245648124/article/details/138026234
 * @Author rookie
 * @Date 2024/12/13 16:33
 * @Version 1.0
 */
class SmartAppliancesFacadeTest {

    @Test
    void test01(){
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        facade.say("关闭家电");
    }

}

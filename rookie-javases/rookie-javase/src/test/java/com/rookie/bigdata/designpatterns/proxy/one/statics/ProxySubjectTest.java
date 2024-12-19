package com.rookie.bigdata.designpatterns.proxy.one.statics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ProxySubjectTest
 * @Description 测试类 https://blog.csdn.net/weixin_39865508/article/details/141924680
 * @Author rookie
 * @Date 2024/12/19 10:55
 * @Version 1.0
 */
class ProxySubjectTest {




    @Test
    void test01(){
        //1.创建目标对象
        Subject subject = new RealSubject();

        //2.创建代理对象(将目标对象传入代理对象构造中)
        Subject sub = new ProxySubject(subject);
        sub.info();
    }

}

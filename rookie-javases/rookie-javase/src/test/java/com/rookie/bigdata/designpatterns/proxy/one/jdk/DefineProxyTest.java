package com.rookie.bigdata.designpatterns.proxy.one.jdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class DefineProxyTest
 * @Description 测试类
 * @Author rookie
 * @Date 2024/12/19 10:58
 * @Version 1.0
 */
class DefineProxyTest {


    @Test
    void test01(){
        //1.创建目标对象
        UserService userService = new UserService();

        //2.创建代理对象
        DefineProxy defineProxy = new DefineProxy(userService);

        //3.调用生成代理方法
        IUserService proxy = (IUserService) defineProxy.createProxy();

        //4.代理执行方法
        boolean flg = proxy.login("小明","12345");
        System.out.println("返回值："+flg);
        System.out.println("=============================");
        proxy.signOut("小明");
    }

}

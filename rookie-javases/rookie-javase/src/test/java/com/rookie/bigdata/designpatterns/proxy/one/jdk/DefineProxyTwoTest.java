package com.rookie.bigdata.designpatterns.proxy.one.jdk;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class DefineProxyTwoTest
 * @Description https://blog.csdn.net/weixin_39865508/article/details/141924680
 * @Author rookie
 * @Date 2024/12/19 10:59
 * @Version 1.0
 */
class DefineProxyTwoTest {


    @Test
    void test01(){
        //1.创建被代理对象
        UserService userService = new UserService();

        //2.获取被代理对象的类加载器，用作生成代理对象的必要参数
        ClassLoader classLoader = userService.getClass().getClassLoader();

        //3.获取被代理对象的实现接口，
        // 用作生成代理对象的必要参数
        // 方法映射就是基于这个参数实现的
        Class<?>[] interfaces = userService.getClass().getInterfaces();

        //4.获取被代理对象的增强主题类，用作生成代理对象的必要参数
        DefineProxyTwo defineProxyTwo = new DefineProxyTwo(userService);

        //5.生成代理对象的核心代码
        IUserService proxyInstance = (IUserService) Proxy.newProxyInstance(classLoader, interfaces, defineProxyTwo);

        // 使用代理对象执行方法
        proxyInstance.login("星星","765432");
        System.out.println("==========================");
        proxyInstance.signOut("星星");
    }

}

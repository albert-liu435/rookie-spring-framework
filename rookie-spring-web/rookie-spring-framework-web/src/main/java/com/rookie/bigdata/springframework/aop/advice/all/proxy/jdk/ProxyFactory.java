package com.rookie.bigdata.springframework.aop.advice.all.proxy.jdk;

import com.rookie.bigdata.springframework.aop.advice.all.proxy.statics.HttpApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Class ProxyFactory
 * @Description
 * @Author rookie
 * @Date 2024/8/27 14:14
 * @Version 1.0
 */
@Slf4j
public class ProxyFactory {
    public static HttpApi getProxy(HttpApi target) {
        return (HttpApi) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LogHandler(target));
    }

    private static class LogHandler implements InvocationHandler {
        private HttpApi target;

        LogHandler(HttpApi target) {
            this.target = target;
        }
        // method底层的方法无参数时，args为空或者长度为0
        @Override
        public Object invoke(Object proxy, Method method, @Nullable Object[] args)
                throws Throwable {
            // 扩展的功能
            log.info("http-statistic:{}", (String) args[0]);
            // 访问基础对象
            return method.invoke(target, args);
        }
    }
}

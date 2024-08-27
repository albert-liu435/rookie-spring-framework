package com.rookie.bigdata.springframework.aop.advice.all.proxy.statics;

/**
 * @Class RealModule
 * @Description 网络请求的真正实现
 * @Author rookie
 * @Date 2024/8/27 14:10
 * @Version 1.0
 */
public class RealModule implements HttpApi {
    @Override
    public String get(String url) {
        return "result";
    }
}

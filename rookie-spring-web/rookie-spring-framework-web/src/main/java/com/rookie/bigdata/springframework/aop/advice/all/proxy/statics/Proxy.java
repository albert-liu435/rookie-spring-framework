package com.rookie.bigdata.springframework.aop.advice.all.proxy.statics;

import lombok.extern.slf4j.Slf4j;

/**
 * @Class Proxy
 * @Description 代理类
 * @Author rookie
 * @Date 2024/8/27 14:11
 * @Version 1.0
 */
@Slf4j
public class Proxy implements HttpApi {
    private HttpApi target;

    Proxy(HttpApi target) {
        this.target = target;
    }

    @Override
    public String get(String url) {
        // 扩展的功能
        log.info("http-statistic {}", url);
        // 访问基础对象
        return target.get(url);
    }
}

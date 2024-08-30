package com.rookie.bigdata.springframework.server;

import org.springframework.stereotype.Component;

/**
 * @Author rookie
 * @Description
 * @Date 2024/8/29 23:18
 * @Version 1.0
 */
@Component
public class PrintServer {
    public void print() {
        System.out.println(System.currentTimeMillis());
    }
}

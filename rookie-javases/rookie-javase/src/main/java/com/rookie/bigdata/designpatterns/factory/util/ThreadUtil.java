package com.rookie.bigdata.designpatterns.factory.util;

/**
 * @Class ThreadUtil
 * @Description 线程工具
 * @Author rookie
 * @Date 2024/12/13 16:46
 * @Version 1.0
 */
public class ThreadUtil {

    public static void sleep(double second) {
        try {
            Thread.sleep((long) (second * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

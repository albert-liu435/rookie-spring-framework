package com.rookie.bigdata.designpatterns.singleton;

import java.io.Serializable;

/**
 * @Class StraightwaySingleton
 * @Description 立即加载模式 (饿汉式)
 * @Author rookie
 * @Date 2024/12/19 9:43
 * @Version 1.0
 */
public class StraightwaySingleton implements Serializable {

    private static StraightwaySingleton straightwaySingleton = new StraightwaySingleton();

    private StraightwaySingleton() {
        // 解决反射创建对象破解单例模式
        if (straightwaySingleton != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static StraightwaySingleton getInstance() {
        return straightwaySingleton;
    }

    /**
     * 解决反序列化创建对象破坏单例模式
     */
    private Object readResolve() {
        return straightwaySingleton;
    }
}

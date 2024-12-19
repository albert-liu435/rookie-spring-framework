package com.rookie.bigdata.designpatterns.singleton;

/**
 * @Class EnumIvoryTower
 * @Description 基于枚举的单例实现
 * @Author rookie
 * @Date 2024/12/19 9:42
 * @Version 1.0
 */
public enum EnumIvoryTower {

    /**
     * 实例
     */
    INSTANCE;

    /**
     * 重写 toString() 方法,打印地址信息
     *
     * @return EnumIvoryTower 地址信息
     */
    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

package com.rookie.bigdata.designpatterns.prototype.one;

import java.util.Objects;

/**
 * @Class Sheep
 * @Description 羊 实体类
 * @Author rookie
 * @Date 2024/12/19 11:04
 * @Version 1.0
 */
public class Sheep {

    // 名称
    private String name;
    // 产地
    public SheepAddress sheepAddress;

    public Sheep(){}

    public Sheep(String name, SheepAddress sheepAddress) {
        this.name = name;
        this.sheepAddress = sheepAddress;
    }

    @Override
    public String toString() {
        return "Sheep{name='" + name + ", sheepAddress=" + sheepAddress +"}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sheepAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SheepAddress getSheepAddress() {
        return sheepAddress;
    }

    public void setSheepAddress(SheepAddress sheepAddress) {
        this.sheepAddress = sheepAddress;
    }
}

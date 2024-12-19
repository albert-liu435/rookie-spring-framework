package com.rookie.bigdata.designpatterns.prototype.two;

import java.util.Objects;

/**
 * @Class SheepClone06
 * @Description 原型设计模式：浅拷贝，创建一只多莉羊并实现其Cloneable接口
 * @Author rookie
 * @Date 2024/12/19 11:06
 * @Version 1.0
 */
public class SheepClone06 implements Cloneable{

    // 名称
    private String name;
    // 产地
    public SheepAddress06 sheepAddress;

    public SheepClone06(){}

    public SheepClone06(String name, SheepAddress06 sheepAddress) {
        this.name = name;
        this.sheepAddress = sheepAddress;
    }

    public void printSheep() {
        System.out.println(name + ":" + "是一只克隆羊！");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sheepAddress);
    }

    @Override
    public String toString() {
        return "SheepClone06{name='" + name + ", sheepAddress=" + sheepAddress + "}";
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SheepAddress06 getSheepAddress() {
        return sheepAddress;
    }

    public void setSheepAddress(SheepAddress06 sheepAddress) {
        this.sheepAddress = sheepAddress;
    }
}

package com.rookie.bigdata.designpatterns.prototype.three;

import java.io.*;
import java.util.Objects;

/**
 * @Class SheepClone07
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:10
 * @Version 1.0
 */

public class SheepClone07 implements Cloneable, Serializable {

    // 名称
    private String name;
    // 产地
    public SheepAddress07 sheepAddress;

    public SheepClone07(){}

    public SheepClone07(String name, SheepAddress07 sheepAddress) {
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
        return "SheepClone07{name='" + name + ", sheepAddress=" + sheepAddress + "}";
    }

    /**
     * 方式一： 通过重写clone方法实现深拷贝
     **/
    protected Object clone() throws CloneNotSupportedException {
        //完成对属性为基本数据类型和String的克隆
        Object deep = super.clone();
        SheepClone07 sheepClone = (SheepClone07) deep;
        sheepClone.sheepAddress = (SheepAddress07) sheepAddress.clone();
        return sheepClone;
    }


    /**
     * 方式二： 通过序列化反序列化实现深拷贝(推荐使用)
     **/
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            SheepClone07 sheepClone = (SheepClone07) ois.readObject();
            return sheepClone;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SheepAddress07 getSheepAddress() {
        return sheepAddress;
    }

    public void setSheepAddress(SheepAddress07 sheepAddress) {
        this.sheepAddress = sheepAddress;
    }
}

package com.rookie.bigdata.designpatterns.prototype.three;

import java.io.Serializable;

/**
 * @Class SheepAddress07
 * @Description
 * @Author rookie
 * @Date 2024/12/19 11:11
 * @Version 1.0
 */
public class SheepAddress07 implements Cloneable, Serializable {

    //省
    private String province;
    //市
    private String city;

    public SheepAddress07(){}

    public SheepAddress07(String province, String city) {
        this.province = province;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "SheepAddress07{province='" + province + "', city='" + city + "}";
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

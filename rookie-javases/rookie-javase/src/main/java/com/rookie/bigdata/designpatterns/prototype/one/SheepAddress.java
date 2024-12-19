package com.rookie.bigdata.designpatterns.prototype.one;

import java.util.Objects;

/**
 * @Class SheepAddress
 * @Description 羊产地
 * @Author rookie
 * @Date 2024/12/19 11:05
 * @Version 1.0
 */
public class SheepAddress {

    //省
    private String province;
    //市
    private String city;

    public SheepAddress(){}

    public SheepAddress(String province, String city) {
        this.province = province;
        this.city = city;
    }

    @Override
    public String toString() {
        return "SheepAddress{province=" + province + ", city='" + city + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(province, city);
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

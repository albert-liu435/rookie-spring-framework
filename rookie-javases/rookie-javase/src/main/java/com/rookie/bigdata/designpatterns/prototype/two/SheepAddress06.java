package com.rookie.bigdata.designpatterns.prototype.two;

/**
 * @Class SheepAddress06
 * @Description 羊的产区
 * @Author rookie
 * @Date 2024/12/19 11:07
 * @Version 1.0
 */
public class SheepAddress06 {

    //省
    private String province;
    //市
    private String city;

    public SheepAddress06(){}

    public SheepAddress06(String province, String city) {
        this.province = province;
        this.city = city;
    }

    @Override
    public String toString() {
        return "SheepAddress06{province='" + province + "', city='" + city + "}";
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

package com.rookie.bigdata.springframework.context.lifecycle.inject;

/**
 * @Class Location
 * @Description
 * @Author rookie
 * @Date 2024/8/23 17:35
 * @Version 1.0
 */
public class Location {
    // 经度坐标
    private Long longitude;
    // 纬度坐标
    private Long latitude;

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }
}

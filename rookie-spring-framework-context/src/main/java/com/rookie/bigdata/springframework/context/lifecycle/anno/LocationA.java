package com.rookie.bigdata.springframework.context.lifecycle.anno;

/**
 * @Class LocationA
 * @Description
 * @Author rookie
 * @Date 2024/7/1 10:03
 * @Version 1.0
 */
public class LocationA {

    // 经度坐标
    private Long longtitude;
    // 纬度坐标
    private Long latitude;

    public LocationA(Long longtitude, Long latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }
}

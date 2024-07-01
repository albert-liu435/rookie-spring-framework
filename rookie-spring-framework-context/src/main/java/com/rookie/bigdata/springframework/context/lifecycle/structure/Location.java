package com.rookie.bigdata.springframework.context.lifecycle.structure;

/**
 * @Class Location
 * @Description
 * @Author rookie
 * @Date 2024/7/1 9:49
 * @Version 1.0
 */
//Address类中添加构造函数：
public class Location {
    // 经度坐标
    private Long longtitude;
    // 纬度坐标
    private Long latitude;

    public Location(Long longtitude, Long latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }
}

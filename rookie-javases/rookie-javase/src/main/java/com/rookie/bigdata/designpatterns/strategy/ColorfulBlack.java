package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class ColorfulBlack
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:01
 * @Version 1.0
 */
public class ColorfulBlack implements Theme {
    @Override
    public void show() {
        System.out.println("- 背景色：backgroundColor 黑色\n" +
                "- 字体颜色：fontColor 灰色\n");
    }
}

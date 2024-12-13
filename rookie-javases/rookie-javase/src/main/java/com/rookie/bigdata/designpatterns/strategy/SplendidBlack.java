package com.rookie.bigdata.designpatterns.strategy;

/**
 * @Class SplendidBlack
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:02
 * @Version 1.0
 */
public class SplendidBlack implements Theme{
    @Override
    public void show() {
        System.out.println("- 背景色：backgroundColor 灰黑色\n" +
                "- 字体颜色：fontColor 黑色\n");
    }
}

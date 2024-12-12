package com.rookie.bigdata.strategy;

/**
 * @Class MotleyBlack
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:01
 * @Version 1.0
 */
public class MotleyBlack implements Theme{
    @Override
    public void show() {
        System.out.println("- 背景色：backgroundColor 黑灰色\n" +
                "- 字体颜色：fontColor 白色\n");
    }
}

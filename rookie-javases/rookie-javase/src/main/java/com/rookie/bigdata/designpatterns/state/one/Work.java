package com.rookie.bigdata.designpatterns.state.one;

/**
 * @Class Work
 * @Description
 * @Author rookie
 * @Date 2024/12/18 13:48
 * @Version 1.0
 */
public class Work {

    private static int clock;

    public static void main(String[] args) {
        // 上午 9 点
        clock = 9;
        writeCode();
        // 中午 12 点
        clock = 12;
        writeCode();
        // 下午 15 点
        clock = 15;
        writeCode();
        // 晚上 21 点
        clock = 21;
        writeCode();
    }

    public static void writeCode() {
        if (clock < 12) {
            System.out.println("精神抖擞写代码");
        } else if (clock < 13) {
            System.out.println("饿了困了写代码");
        } else if (clock < 17) {
            System.out.println("状态一般写代码");
        } else if (clock < 23) {
            System.out.println("加班疲惫写代码");
        }
    }
}

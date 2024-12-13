package com.rookie.bigdata.designpatterns.factory.method;

import com.rookie.bigdata.designpatterns.factory.util.ThreadUtil;

/**
 * @Class CircularFactory
 * @Description 圆形工厂
 * @Author rookie
 * @Date 2024/12/13 16:44
 * @Version 1.0
 */
public class CircularFactory extends AbstractGraphicalFactory {

    /**
     * 将创建复杂的圆形过程封装到工厂里。
     * 1. 选定圆形位置；
     * 2. 指定圆形半径；
     * 3. 设置绘制图形所用的画笔；
     * 4. 选择图形的颜色；
     * 5. 。。。。。
     *
     * @return 一个复杂的圆形
     */
    @Override
    public Graphical creat() {

        System.out.println("正在选取圆形位置。。。。");
        ThreadUtil.sleep(0.5);
        System.out.println("正在指定圆形半径。。。。");
        ThreadUtil.sleep(0.9);
        System.out.println("正在设置绘制图形所用的画笔。。。。");
        ThreadUtil.sleep(0.5);
        System.out.println("正在选择图形的颜色。。。。");
        ThreadUtil.sleep(0.8);
        System.out.println("正在绘制。。。。");
        ThreadUtil.sleep(1.5);
        System.out.println("绘制完成。。。。");
        return new Circular();
    }
}

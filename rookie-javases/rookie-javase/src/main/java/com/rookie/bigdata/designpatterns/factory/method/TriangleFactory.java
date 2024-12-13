package com.rookie.bigdata.designpatterns.factory.method;

import com.rookie.bigdata.designpatterns.factory.util.ThreadUtil;

/**
 * @Class TriangleFactory
 * @Description 三角形工厂
 * @Author rookie
 * @Date 2024/12/13 16:50
 * @Version 1.0
 */
public class TriangleFactory extends AbstractGraphicalFactory {

    /**
     * 通过三角形工厂创建一个复杂的三角形
     *
     * @return 一个复杂的圆形
     */
    @Override
    public Graphical creat() {
        System.out.println("正在设置绘制图形所用的画笔。。。。");
        ThreadUtil.sleep(0.5);
        System.out.println("正在选择图形的颜色。。。。");
        ThreadUtil.sleep(0.8);
        System.out.println("正在绘制。。。。");
        ThreadUtil.sleep(1.5);
        System.out.println("绘制完成。。。。");
        return new Triangle();
    }
}

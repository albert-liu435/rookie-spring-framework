package com.rookie.bigdata.designpatterns.factory.method;

import com.rookie.bigdata.designpatterns.factory.util.ThreadUtil;

/**
 * @Class RectangleFactory
 * @Description 矩形工厂
 * @Author rookie
 * @Date 2024/12/13 16:47
 * @Version 1.0
 */
public class RectangleFactory extends AbstractGraphicalFactory {
    /**
     * 通过工厂创建一个复杂的矩形
     *
     * @return 一个复杂的矩形
     */
    @Override
    public Graphical creat() {
        System.out.println("正在选取矩形位置。。。。");
        ThreadUtil.sleep(1.5);
        System.out.println("正在设置绘制图形所用的画笔。。。。");
        ThreadUtil.sleep(0.5);
        System.out.println("正在选择图形的颜色。。。。");
        ThreadUtil.sleep(0.8);
        System.out.println("正在绘制。。。。");
        ThreadUtil.sleep(1.5);
        System.out.println("绘制完成。。。。");
        return new Rectangle();
    }
}

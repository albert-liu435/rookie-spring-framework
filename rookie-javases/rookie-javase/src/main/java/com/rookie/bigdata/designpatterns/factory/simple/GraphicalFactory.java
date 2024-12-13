package com.rookie.bigdata.designpatterns.factory.simple;

/**
 * @Class GraphicalFactory
 * @Description 图形工厂
 * @Author rookie
 * @Date 2024/12/13 16:38
 * @Version 1.0
 */
public class GraphicalFactory {
    public static final int CIRCULAR = 0;
    public static final int RECTANGLE = 1;
    public static final int TRIANGLE = 2;


    public static Graphical create(int type) {
        switch (type) {
            case CIRCULAR:
                return new Circular();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            default:
                throw new IllegalStateException("please check param， range 0 - 2");
        }
    }
}


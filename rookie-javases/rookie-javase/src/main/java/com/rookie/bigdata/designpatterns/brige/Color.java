package com.rookie.bigdata.designpatterns.brige;

/**
 * @Class Color
 * @Description
 * @Author rookie
 * @Date 2024/12/13 9:23
 * @Version 1.0
 */
public class Color extends Shape {

    private Shape shape;

    public Color(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        setColor();
        shape.draw();
        resetColor();
    }

    private void setColor() {
        System.out.println("设置颜色");
    }

    private void resetColor() {
        System.out.println("重置颜色");
    }

}

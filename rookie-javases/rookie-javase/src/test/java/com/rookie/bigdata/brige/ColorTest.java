package com.rookie.bigdata.brige;

import org.junit.jupiter.api.Test;


/**
 * @Class ColorTest
 * @Description https://blog.csdn.net/miaoyl1234/article/details/134247994
 * @Author rookie
 * @Date 2024/12/13 9:24
 * @Version 1.0
 */
class ColorTest {


    @Test
    void test01() {
        Shape circle = new Circle();
        Shape square = new Square();

        Shape coloredCircle = new Color(circle);
        Shape coloredSquare = new Color(square);

        coloredCircle.draw();
        coloredSquare.draw();

    }

}

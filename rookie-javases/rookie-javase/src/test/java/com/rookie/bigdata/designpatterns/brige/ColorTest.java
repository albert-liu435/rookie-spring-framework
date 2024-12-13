package com.rookie.bigdata.designpatterns.brige;

import com.rookie.bigdata.designpatterns.brige.Circle;
import com.rookie.bigdata.designpatterns.brige.Color;
import com.rookie.bigdata.designpatterns.brige.Shape;
import com.rookie.bigdata.designpatterns.brige.Square;
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

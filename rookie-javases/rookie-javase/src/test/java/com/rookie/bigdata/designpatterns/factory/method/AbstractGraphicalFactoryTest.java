package com.rookie.bigdata.designpatterns.factory.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AbstractGraphicalFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 16:50
 * @Version 1.0
 */
class AbstractGraphicalFactoryTest {

    @Test
    void creat() {
        AbstractGraphicalFactory circularFactory = new CircularFactory();
        Graphical circular = circularFactory.creat();
        circular.description();

        System.out.println();

        AbstractGraphicalFactory rectangleFactory = new RectangleFactory();
        Graphical rectangle = rectangleFactory.creat();
        rectangle.description();

        System.out.println();

        AbstractGraphicalFactory triangleFactory = new TriangleFactory();
        Graphical triangle = triangleFactory.creat();
        triangle.description();
    }


}

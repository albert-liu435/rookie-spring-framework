package com.rookie.bigdata.designpatterns.factory.simple;

import com.rookie.bigdata.designpatterns.factory.simple.Graphical;
import com.rookie.bigdata.designpatterns.factory.simple.GraphicalFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Class GraphicalFactoryTest
 * @Description 图形工厂测试类
 * @Author rookie
 * @Date 2024/12/13 16:39
 * @Version 1.0
 */
class GraphicalFactoryTest {


    @Test
    void create() {
        final Graphical circular = GraphicalFactory.create(0);
        Assertions.assertEquals(circular.toString(), "Circular");

        final Graphical rectangle = GraphicalFactory.create(1);
        Assertions.assertEquals(rectangle.toString(), "Rectangle");

        final Graphical triangle = GraphicalFactory.create(2);
        Assertions.assertEquals(triangle.toString(), "Triangle");
    }


}

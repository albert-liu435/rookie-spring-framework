package com.rookie.bigdata.designpatterns.visitor.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class ExpressionEvaluatorTest
 * @Description https://blog.csdn.net/kiingking/article/details/140345205
 * @Author rookie
 * @Date 2024/12/16 18:23
 * @Version 1.0
 */
class ExpressionEvaluatorTest {


    @Test
    void test01() {
        Node node = new AdditionNode(
                new NumberNode(5),
                new AdditionNode(
                        new NumberNode(10),
                        new NumberNode(15)
                )
        );

        ExpressionPrinter printer = new ExpressionPrinter();
        node.accept(printer); // 输出: (5 + (10 + 15))

        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        node.accept(evaluator); // 计算结果
        System.out.println(evaluator.getResult()); // 输出: 30
    }

}

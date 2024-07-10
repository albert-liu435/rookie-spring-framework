package com.rookie.bigdata.springframework.expression;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyExpressionParserDemoTest
 * @Description TODO
 * @Author rookie
 * @Date 2024/7/10 16:46
 * @Version 1.0
 */
class MyExpressionParserDemoTest {


    @Test
    void test01(){
        // 创建解析器实例
        ExpressionParser parser = new SpelExpressionParser();
        // 解析基本表达式
        Expression expression = parser.parseExpression("100 * 2 + 10");

        System.out.println("expression = " + expression);

        // 为表达式计算结果
        Integer result = expression.getValue(Integer.class);
        System.out.println("表达式 '100 + 10' 的结果为: " + result);
    }

}

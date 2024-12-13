package com.rookie.bigdata.designpatterns.decorator.one;

import com.rookie.bigdata.designpatterns.decorator.one.*;
import org.junit.jupiter.api.Test;

/**
 * @Class TextDecoratorTest
 * @Description https://blog.csdn.net/qq_27656927/article/details/141455162
 * @Author rookie
 * @Date 2024/12/13 16:19
 * @Version 1.0
 */
class TextDecoratorTest {

    @Test
    void test01(){
        Text text = new PlainText("Hello, World!");

        // 只加粗
        Text boldText = new BoldTextDecorator(text);
        System.out.println(boldText.getContent());

        // 加粗 + 下划线
        Text boldUnderlineText = new UnderlineTextDecorator(boldText);
        System.out.println(boldUnderlineText.getContent());

        // 加粗 + 下划线 + 斜体
        Text boldUnderlineItalicText = new ItalicTextDecorator(boldUnderlineText);
        System.out.println(boldUnderlineItalicText.getContent());
    }
}

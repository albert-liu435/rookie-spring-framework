package com.rookie.bigdata.designpatterns.decorator.one;

/**
 * @Class ItalicTextDecorator
 * @Description 斜体装饰器
 * @Author rookie
 * @Date 2024/12/13 16:18
 * @Version 1.0
 */
public class ItalicTextDecorator extends TextDecorator{
    public ItalicTextDecorator(Text text) {
        super(text);
    }
    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}

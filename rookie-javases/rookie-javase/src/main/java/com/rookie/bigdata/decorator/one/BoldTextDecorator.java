package com.rookie.bigdata.decorator.one;

/**
 * @Class BoldTextDecorator
 * @Description 加粗装饰器
 * @Author rookie
 * @Date 2024/12/13 16:16
 * @Version 1.0
 */
public class BoldTextDecorator extends TextDecorator{
    public BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}

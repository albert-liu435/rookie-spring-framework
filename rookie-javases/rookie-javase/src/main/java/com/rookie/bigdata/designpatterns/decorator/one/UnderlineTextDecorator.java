package com.rookie.bigdata.designpatterns.decorator.one;

/**
 * @Class UnderlineTextDecorator
 * @Description 下划线装饰器
 * @Author rookie
 * @Date 2024/12/13 16:17
 * @Version 1.0
 */
public class UnderlineTextDecorator extends TextDecorator {
    public UnderlineTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<u>" + super.getContent() + "</u>";

    }
}

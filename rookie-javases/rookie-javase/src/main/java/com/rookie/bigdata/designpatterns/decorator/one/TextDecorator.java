package com.rookie.bigdata.designpatterns.decorator.one;

/**
 * @Class TextDecorator
 * @Description 实现装饰器抽象类
 * @Author rookie
 * @Date 2024/12/13 16:15
 * @Version 1.0
 */
public abstract class TextDecorator implements Text {

    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text.getContent();
    }
}

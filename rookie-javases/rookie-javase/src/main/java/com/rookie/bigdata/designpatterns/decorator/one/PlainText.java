package com.rookie.bigdata.designpatterns.decorator.one;

/**
 * @Class PlainText
 * @Description 实现具体组件
 * @Author rookie
 * @Date 2024/12/13 16:13
 * @Version 1.0
 */
public class PlainText implements Text {

    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

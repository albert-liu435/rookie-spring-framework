package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class Node
 * @Description 元素接口
 * @Author rookie
 * @Date 2024/12/13 17:06
 * @Version 1.0
 */
public interface Node {

    void accept(NodeVisitor visitor);
}

package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class NodeVisitor
 * @Description
 * @Author rookie
 * @Date 2024/12/13 17:07
 * @Version 1.0
 */
public interface NodeVisitor {

    void visit(NumberNode node);

    void visit(AdditionNode node);

}

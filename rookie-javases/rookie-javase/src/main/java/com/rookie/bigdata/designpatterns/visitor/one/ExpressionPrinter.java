package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class ExpressionPrinter
 * @Description
 * @Author rookie
 * @Date 2024/12/13 17:11
 * @Version 1.0
 */
public class ExpressionPrinter implements NodeVisitor{
    @Override
    public void visit(NumberNode node) {
        System.out.println(node.getValue());
    }

    @Override
    public void visit(AdditionNode node) {
        System.out.print("(");
        node.getLeft().accept(this);
        System.out.print(" + ");
        node.getRight().accept(this);
        System.out.print(")");
    }
}

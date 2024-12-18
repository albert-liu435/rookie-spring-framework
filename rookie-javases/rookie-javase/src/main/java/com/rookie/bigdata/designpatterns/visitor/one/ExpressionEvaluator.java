package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class ExpressionEvaluator
 * @Description
 * @Author rookie
 * @Date 2024/12/13 17:12
 * @Version 1.0
 */
public class ExpressionEvaluator implements NodeVisitor{
    private int result;

    public int getResult() {
        return result;
    }

    @Override
    public void visit(NumberNode node) {
        result += node.getValue();
    }

    @Override
    public void visit(AdditionNode node) {
        int originalResult = result;
        node.getLeft().accept(this);
        node.getRight().accept(this);
//        result = originalResult;
    }
}

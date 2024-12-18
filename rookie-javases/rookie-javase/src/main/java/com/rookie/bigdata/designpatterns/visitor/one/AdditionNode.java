package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class AdditionNode
 * @Description
 * @Author rookie
 * @Date 2024/12/13 17:10
 * @Version 1.0
 */
public class AdditionNode implements Node {

    private Node left, right;


    public AdditionNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }
}

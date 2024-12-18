package com.rookie.bigdata.designpatterns.visitor.one;

/**
 * @Class NumberNode
 * @Description TODO
 * @Author rookie
 * @Date 2024/12/13 17:09
 * @Version 1.0
 */
public class NumberNode implements Node{

    private int value;

    public NumberNode(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(NodeVisitor visitor) {

        visitor.visit(this);
    }
}

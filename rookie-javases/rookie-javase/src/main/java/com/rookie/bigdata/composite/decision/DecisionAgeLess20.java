package com.rookie.bigdata.composite.decision;

/**
 * @Class DecisionAgeLess20
 * @Description 决策部分 - 年龄 小于 20 岁
 * @Author rookie
 * @Date 2024/12/13 15:57
 * @Version 1.0
 */
public class DecisionAgeLess20 extends DecisionComponent {

    public DecisionAgeLess20(String name) {
        super(name);
    }


    @Override
    protected boolean judge(User user) {
        return user.getAge() < 20;
    }

    @Override
    protected void add(DecisionComponent decisionComponent) {
        decisionComponent.add(decisionComponent);
    }

    @Override
    protected void remove(DecisionComponent decisionComponent) {
        decisionComponent.remove(decisionComponent);
    }
}

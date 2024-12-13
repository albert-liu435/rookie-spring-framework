package com.rookie.bigdata.composite.decision;

/**
 * @Class DecisionAgeThan40
 * @Description 决策部分 - 年龄 大于 40 岁
 * @Author rookie
 * @Date 2024/12/13 15:56
 * @Version 1.0
 */
public class DecisionAgeThan40 extends DecisionComponent {

    public DecisionAgeThan40(String name) {
        super(name);
    }

    @Override
    protected boolean judge(User user) {
        return 40 <= user.getAge();
    }

    @Override
    protected void add(DecisionComponent decisionComponent) {
        decisionComponents.add(decisionComponent);
    }

    @Override
    protected void remove(DecisionComponent decisionComponent) {
        decisionComponents.remove(decisionComponent);
    }
}

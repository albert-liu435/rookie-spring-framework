package com.rookie.bigdata.designpatterns.composite.decision;

/**
 * @Class DecisionAgeAmong30and40
 * @Description 决策部分 - 年龄 30 - 40 之间
 * @Author rookie
 * @Date 2024/12/13 15:58
 * @Version 1.0
 */
public class DecisionAgeAmong30and40 extends DecisionComponent {
    public DecisionAgeAmong30and40(String name) {
        super(name);
    }

    @Override
    protected boolean judge(User user) {
        return 30 <= user.getAge() && user.getAge() < 40;
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

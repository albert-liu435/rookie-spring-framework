package com.rookie.bigdata.designpatterns.composite.decision;

/**
 * @Class DecisionGenderMale
 * @Description 决策部分 - 性别
 * @Author rookie
 * @Date 2024/12/13 15:55
 * @Version 1.0
 */
public class DecisionGenderMale extends DecisionComponent {

    public DecisionGenderMale(String name) {
        super(name);
    }

    @Override
    protected boolean judge(User user) {
        return user.getGender() == Gender.MALE;
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

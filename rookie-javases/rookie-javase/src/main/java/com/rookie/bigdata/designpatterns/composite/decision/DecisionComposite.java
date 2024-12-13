package com.rookie.bigdata.designpatterns.composite.decision;

/**
 * @Class DecisionComposite
 * @Description 决策部分决策部分
 * @Author rookie
 * @Date 2024/12/13 15:56
 * @Version 1.0
 */
public class DecisionComposite extends DecisionComponent {

    public DecisionComposite(String name) {
        super(name);
    }

    @Override
    protected boolean judge(User user) {
        return user != null;
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

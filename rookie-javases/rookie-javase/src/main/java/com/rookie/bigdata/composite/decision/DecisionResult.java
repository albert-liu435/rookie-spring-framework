package com.rookie.bigdata.composite.decision;

import java.util.StringJoiner;

/**
 * @Class DecisionResult
 * @Description 决策结果
 * @Author rookie
 * @Date 2024/12/13 15:54
 * @Version 1.0
 */
public class DecisionResult extends DecisionComponent {
    /**
     * 商品类型
     */
    private String type;

    public DecisionResult(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DecisionResult.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .toString();
    }

    @Override
    protected DecisionComponent decision(User user) {
        return this;
    }

    @Override
    protected boolean judge(User user) {
        return true;
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

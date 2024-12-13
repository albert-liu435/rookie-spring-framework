package com.rookie.bigdata.designpatterns.composite.decision;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class DecisionComponent
 * @Description 决策组件
 * @Author rookie
 * @Date 2024/12/13 15:50
 * @Version 1.0
 */
public abstract class DecisionComponent {

    protected String name;
//    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected List<DecisionComponent> decisionComponents = new ArrayList<>();

    public DecisionComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 决策
     *
     * @param user 用户信息
     * @return 决策结果
     */
    protected DecisionComponent decision(User user) {
        if (judge(user)) {
//            logger.info("进入 {} 决策分支", getName());
            System.out.println("进入 "+getName()+" 决策分支");
            for (DecisionComponent decisionComponent : decisionComponents) {
                if (decisionComponent.judge(user)) {
                    return decisionComponent.decision(user);
                }
            }
        }
        return null;
    }


    protected abstract boolean judge(User user);

    protected abstract void add(DecisionComponent decisionComponent);

    protected abstract void remove(DecisionComponent decisionComponent);
}

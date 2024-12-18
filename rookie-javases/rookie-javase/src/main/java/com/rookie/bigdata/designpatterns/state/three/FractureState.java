package com.rookie.bigdata.designpatterns.state.three;

/**
 * @Class FractureState
 * @Description 状态接口实现类,骨折状态下的行为: 只能唱、rap
 * @Author rookie
 * @Date 2024/12/18 18:41
 * @Version 1.0
 */
public class FractureState implements State{
    @Override
    public void action() {
        System.out.println("实习一坤年的骨折练习生只会：唱和rap");
    }
}

package com.rookie.bigdata.designpatterns.decorator.two;

/**
 * @Class PlayerTank
 * @Description 玩家坦克
 * @Author rookie
 * @Date 2024/12/13 16:26
 * @Version 1.0
 */
public class PlayerTank extends Tank {

    /**
     * 玩家默认坦克数据，移动，设计速度 1
     */
    public PlayerTank() {
        super(1, 1);
    }
}


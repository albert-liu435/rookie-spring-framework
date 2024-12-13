package com.rookie.bigdata.designpatterns.build.gof;

import com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole;

/**
 * @Class Director
 * @Description 游戏角色构建指挥者
 * @Author rookie
 * @Date 2024/12/13 11:22
 * @Version 1.0
 */
public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public PlayerRole construct() {
        builder.setHairColor();
        builder.setShape();
        builder.setSkinColour();
        return builder.build();
    }

    public PlayerRole construct2() {
        builder.setHairColor();
        return builder.build();
    }

    public PlayerRole construct3() {
        builder.setSkinColour();
        return builder.build();
    }
}

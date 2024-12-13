package com.rookie.bigdata.designpatterns.build.gof;

import com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole;

/**
 * @Class Builder
 * @Description 抽象构建者
 * @Author rookie
 * @Date 2024/12/13 11:18
 * @Version 1.0
 */
public abstract class Builder {

    protected com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole playerRole = new com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole();

    abstract void setHairColor();

    abstract void setShape();

    abstract void setSkinColour();

    PlayerRole build() {
        return playerRole;
    }
}

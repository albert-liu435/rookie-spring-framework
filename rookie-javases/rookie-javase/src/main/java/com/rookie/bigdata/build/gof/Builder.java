package com.rookie.bigdata.build.gof;

import com.rookie.bigdata.build.lvgo.PlayerRole;

/**
 * @Class Builder
 * @Description 抽象构建者
 * @Author rookie
 * @Date 2024/12/13 11:18
 * @Version 1.0
 */
public abstract class Builder {

    protected PlayerRole playerRole = new PlayerRole();

    abstract void setHairColor();

    abstract void setShape();

    abstract void setSkinColour();

    PlayerRole build() {
        return playerRole;
    }
}

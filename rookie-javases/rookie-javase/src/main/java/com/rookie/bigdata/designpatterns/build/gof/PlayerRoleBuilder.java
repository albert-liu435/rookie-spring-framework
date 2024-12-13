package com.rookie.bigdata.designpatterns.build.gof;

/**
 * @Class PlayerRoleBuilder
 * @Description 游戏角色建造者
 * @Author rookie
 * @Date 2024/12/13 11:23
 * @Version 1.0
 */
public class PlayerRoleBuilder extends Builder {
    @Override
    void setHairColor() {
        playerRole.setHairColor("褐色");
    }

    @Override
    void setShape() {
        playerRole.setShape("健硕");
    }

    @Override
    void setSkinColour() {
        playerRole.setSkinColour("古铜色");
    }
}

package com.rookie.bigdata.designpatterns.build.lvgo;

/**
 * @Class PlayerRoleBuilder
 * @Description 游戏角色建造者
 * @Author rookie
 * @Date 2024/12/13 11:21
 * @Version 1.0
 */
public class PlayerRoleBuilder {

    private final PlayerRole playerRole = new PlayerRole();

    PlayerRoleBuilder hairColor(String color) {
        playerRole.setHairColor(color);
        return this;
    }

    PlayerRoleBuilder shape(String shape) {
        playerRole.setShape(shape);
        return this;
    }

    PlayerRoleBuilder skinColour(String skinColour) {
        playerRole.setSkinColour(skinColour);
        return this;
    }

    PlayerRole build() {
        return playerRole;
    }
}

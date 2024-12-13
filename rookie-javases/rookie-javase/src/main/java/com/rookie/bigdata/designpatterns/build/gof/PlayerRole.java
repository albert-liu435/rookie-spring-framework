package com.rookie.bigdata.designpatterns.build.gof;

/**
 * @Class PlayerRole
 * @Description 游戏角色
 * @Author rookie
 * @Date 2024/12/13 11:23
 * @Version 1.0
 */
public class PlayerRole {

    private String hairColor;
    private String shape;
    private String skinColour;

    public PlayerRole() {
    }

    public PlayerRole(String hairColor, String shape, String skinColour) {
        this.hairColor = hairColor;
        this.shape = shape;
        this.skinColour = skinColour;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlayerRole{");
        sb.append("hairColor='").append(hairColor).append('\'');
        sb.append(", shape='").append(shape).append('\'');
        sb.append(", skinColour='").append(skinColour).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

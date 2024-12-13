package com.rookie.bigdata.designpatterns.build.gof;

/**
 * @Class RedHairPlayerBuilder
 * @Description 红头发角色建造者
 * @Author rookie
 * @Date 2024/12/13 11:24
 * @Version 1.0
 */
public class RedHairPlayerBuilder extends Builder {
    @Override
    void setHairColor() {
        playerRole.setHairColor("红色");
    }

    @Override
    void setShape() {

    }

    @Override
    void setSkinColour() {

    }
}

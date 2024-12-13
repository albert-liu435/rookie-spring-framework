package com.rookie.bigdata.designpatterns.build.gof;

import com.rookie.bigdata.designpatterns.build.gof.Builder;
import com.rookie.bigdata.designpatterns.build.gof.Director;
import com.rookie.bigdata.designpatterns.build.gof.PlayerRoleBuilder;
import com.rookie.bigdata.designpatterns.build.gof.RedHairPlayerBuilder;
import com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole;
import org.junit.jupiter.api.Test;


/**
 * @Class BuilderTest
 * @Description gof builder test
 * @Author rookie
 * @Date 2024/12/13 11:25
 * @Version 1.0
 */
class BuilderTest {
    @Test
    void build() {
        Builder playerRoleBuilder = new PlayerRoleBuilder();
        Director playerRoleBuildDirector = new Director(playerRoleBuilder);
       PlayerRole construct = playerRoleBuildDirector.construct();
        System.out.println("construct = " + construct);
    }

    @Test
    void redHairBuild() {
        Builder playerRoleBuilder = new RedHairPlayerBuilder();
        Director playerRoleBuildDirector = new Director(playerRoleBuilder);
        PlayerRole construct = playerRoleBuildDirector.construct();
        System.out.println("construct = " + construct);
    }

}

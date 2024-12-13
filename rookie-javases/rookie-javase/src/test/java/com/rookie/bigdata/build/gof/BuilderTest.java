package com.rookie.bigdata.build.gof;

import com.rookie.bigdata.build.lvgo.PlayerRole;
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

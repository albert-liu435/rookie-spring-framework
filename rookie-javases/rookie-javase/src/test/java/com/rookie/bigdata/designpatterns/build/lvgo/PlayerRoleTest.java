package com.rookie.bigdata.designpatterns.build.lvgo;

import com.rookie.bigdata.designpatterns.build.lvgo.PlayerRole;
import com.rookie.bigdata.designpatterns.build.lvgo.PlayerRoleBuilder;
import org.junit.jupiter.api.Test;

/**
 * @Class PlayerRoleTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:26
 * @Version 1.0
 */
class PlayerRoleTest {
    @Test
    void test() {
        PlayerRoleBuilder playerRoleBuilder = new PlayerRoleBuilder();
        playerRoleBuilder.hairColor("红色").shape("健硕").skinColour("古铜色");
        PlayerRole build = playerRoleBuilder.build();
        System.out.println("build = " + build);
    }
}

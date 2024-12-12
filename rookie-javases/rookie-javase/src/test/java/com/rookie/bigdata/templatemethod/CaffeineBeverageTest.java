package com.rookie.bigdata.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class CaffeineBeverageTest
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:16
 * @Version 1.0
 */
class CaffeineBeverageTest {


    @Test
    void test01() {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-----------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();

    }

}

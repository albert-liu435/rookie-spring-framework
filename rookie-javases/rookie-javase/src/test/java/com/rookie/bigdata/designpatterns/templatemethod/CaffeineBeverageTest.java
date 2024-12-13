package com.rookie.bigdata.designpatterns.templatemethod;

import com.rookie.bigdata.designpatterns.templatemethod.CaffeineBeverage;
import com.rookie.bigdata.designpatterns.templatemethod.Coffee;
import com.rookie.bigdata.designpatterns.templatemethod.Tea;
import org.junit.jupiter.api.Test;

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

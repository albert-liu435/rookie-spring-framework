package com.rookie.bigdata.strategy;


import org.junit.jupiter.api.Test;

/**
 * @Class ContextTest
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:02
 * @Version 1.0
 */
class ContextTest {


    @Test
    void show(){

        Context context = new Context();
        System.out.println("七彩斑斓的黑");
        context.setTheme(new ColorfulBlack());
        context.show();

        System.out.println("五颜六色的黑");
        context.setTheme(new MotleyBlack());
        context.show();

        System.out.println("绚烂多彩的黑");
        context.setTheme(new SplendidBlack());
        context.show();
    }

}

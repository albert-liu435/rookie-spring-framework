package com.rookie.bigdata.templatemethod;

/**
 * @Class CaffeineBeverage
 * @Description https://pdai.tech/md/dev-spec/pattern/17_template.html
 * @Author rookie
 * @Date 2024/12/12 18:14
 * @Version 1.0
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}

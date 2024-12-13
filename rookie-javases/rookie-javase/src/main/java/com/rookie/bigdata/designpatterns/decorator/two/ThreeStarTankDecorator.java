package com.rookie.bigdata.designpatterns.decorator.two;

/**
 * @Class ThreeStarTankDecorator
 * @Description 三星坦克装饰者
 * @Author rookie
 * @Date 2024/12/13 16:26
 * @Version 1.0
 */
public class ThreeStarTankDecorator extends TankDecorator {
    public ThreeStarTankDecorator(Tank tank) {
        super(tank);
    }


    @Override
    protected void fire() {
        super.fire();
        System.out.println("白色砖头击碎");
    }
}

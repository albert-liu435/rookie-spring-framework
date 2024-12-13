package com.rookie.bigdata.decorator.two;

/**
 * @Class TwoStarTankDecorator
 * @Description 两星坦克装饰者
 * @Author rookie
 * @Date 2024/12/13 16:27
 * @Version 1.0
 */
public class TwoStarTankDecorator extends TankDecorator {
    public TwoStarTankDecorator(Tank tank) {
        super(tank);
    }


    @Override
    protected void fire() {
        super.fire();
        super.fire();
    }
}

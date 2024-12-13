package com.rookie.bigdata.designpatterns.decorator.two;

/**
 * @Class OneStarTankDecorator
 * @Description 一星坦克装饰者
 * @Author rookie
 * @Date 2024/12/13 16:26
 * @Version 1.0
 */
public class OneStarTankDecorator extends TankDecorator {
    public OneStarTankDecorator(Tank tank) {
        super(tank);
    }

    @Override
    protected void move() {
        tank.setMoveSpeed(2);
        super.move();
    }

    @Override
    protected void fire() {
        tank.setShootSpeed(2);
        super.fire();
    }
}

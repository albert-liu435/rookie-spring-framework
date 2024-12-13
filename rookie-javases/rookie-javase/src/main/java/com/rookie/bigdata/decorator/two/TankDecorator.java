package com.rookie.bigdata.decorator.two;

/**
 * @Class TankDecorator
 * @Description 定义坦克抽象装饰者
 * @Author rookie
 * @Date 2024/12/13 16:25
 * @Version 1.0
 */
public abstract class TankDecorator extends Tank {

    protected Tank tank;

    public TankDecorator(Tank tank) {
        this.tank = tank;
    }

    @Override
    protected void move() {
        tank.move();
    }

    @Override
    protected void fire() {
        tank.fire();
    }
}

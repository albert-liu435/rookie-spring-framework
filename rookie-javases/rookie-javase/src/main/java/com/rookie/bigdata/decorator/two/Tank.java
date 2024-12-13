package com.rookie.bigdata.decorator.two;

/**
 * @Class Tank
 * @Description 抽象坦克类
 * @Author rookie
 * @Date 2024/12/13 16:23
 * @Version 1.0
 */
public abstract class Tank {

    /**
     * 移动速度
     */
    protected int moveSpeed;

    /**
     * 射击速度
     */
    protected int shootSpeed;

    public Tank() {

    }

    public Tank(int moveSpeed, int shootSpeed) {
        this.moveSpeed = moveSpeed;
        this.shootSpeed = shootSpeed;
    }

    protected void move() {
        System.out.println("它移动了，当前移动速度：" + moveSpeed);
    }

    protected void fire() {
        System.out.println("它开火了，当前射击速度：" + shootSpeed);
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getShootSpeed() {
        return shootSpeed;
    }

    public void setShootSpeed(int shootSpeed) {
        this.shootSpeed = shootSpeed;
    }
}


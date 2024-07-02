package com.rookie.bigdata.springframework.context.annotation.conditional;

/**
 * @Author rookie
 * @Description
 * @Date 2024/7/1 20:52
 * @Version 1.0
 */
public class System {

    private String name;

    public System(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "System{" +
                "name='" + name + '\'' +
                '}';
    }
}

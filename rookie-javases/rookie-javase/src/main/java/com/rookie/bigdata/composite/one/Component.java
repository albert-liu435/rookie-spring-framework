package com.rookie.bigdata.composite.one;

/**
 * @Class Component
 * @Description https://pdai.tech/md/dev-spec/pattern/11_compsite.html
 * @Author rookie
 * @Date 2024/12/13 15:47
 * @Version 1.0
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}

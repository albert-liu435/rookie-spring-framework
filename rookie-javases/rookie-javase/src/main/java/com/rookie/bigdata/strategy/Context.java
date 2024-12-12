package com.rookie.bigdata.strategy;

/**
 * @Class Context
 * @Description
 * @Author rookie
 * @Date 2024/12/12 18:02
 * @Version 1.0
 */
public class Context {
    private Theme theme;

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void show() {
        theme.show();
    }
}

package com.rookie.bigdata.designpatterns.command.co;

/**
 * @Class Invoker
 * @Description 调用者
 * @Author rookie
 * @Date 2024/12/13 11:57
 * @Version 1.0
 */
public class Invoker {
    private Command command;

    public void executeCommand() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}

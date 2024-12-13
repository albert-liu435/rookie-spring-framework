package com.rookie.bigdata.designpatterns.command;

/**
 * @Class CommandInvoker
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:53
 * @Version 1.0
 */
public class CommandInvoker {
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

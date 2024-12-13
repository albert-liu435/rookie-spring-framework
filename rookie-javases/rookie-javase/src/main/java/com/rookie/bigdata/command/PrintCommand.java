package com.rookie.bigdata.command;

/**
 * @Class PrintCommand
 * @Description 具体的命令
 * @Author rookie
 * @Date 2024/12/13 11:52
 * @Version 1.0
 */
public class PrintCommand implements Command {
    private String message;

    public PrintCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("执行打印命令： " + message);
    }
}

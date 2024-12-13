package com.rookie.bigdata.designpatterns.command.co;

/**
 * @Class AddFileCommand
 * @Description 新增文件命令
 * @Author rookie
 * @Date 2024/12/13 11:56
 * @Version 1.0
 */
public class AddFileCommand implements Command{
    private final Receiver receiver;

    public AddFileCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

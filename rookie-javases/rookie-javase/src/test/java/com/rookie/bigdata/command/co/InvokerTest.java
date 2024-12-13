package com.rookie.bigdata.command.co;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class InvokerTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:58
 * @Version 1.0
 */
class InvokerTest {

    @Test
    void test01(){
        FileReceiver fileReceiver = new FileReceiver();
        AddFileCommand addFileCommand = new AddFileCommand(fileReceiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(addFileCommand);
        invoker.executeCommand();
    }

}

package com.rookie.bigdata.designpatterns.command;

import com.rookie.bigdata.designpatterns.command.CommandInvoker;
import com.rookie.bigdata.designpatterns.command.PrintCommand;
import com.rookie.bigdata.designpatterns.command.Printer;
import org.junit.jupiter.api.Test;

/**
 * @Class CommandInvokerTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:53
 * @Version 1.0
 */
class CommandInvokerTest {


    @Test
    void test01(){
        Printer printer=new Printer();
        PrintCommand printCommand = new PrintCommand("Hello, World!");
        CommandInvoker commandInvoker = new CommandInvoker(printCommand);

        commandInvoker.executeCommand(); // 输出：执行打印命令： Hello, World!
    }

}

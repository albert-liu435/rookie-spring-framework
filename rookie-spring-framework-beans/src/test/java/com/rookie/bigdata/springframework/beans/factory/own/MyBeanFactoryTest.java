package com.rookie.bigdata.springframework.beans.factory.own;

import com.rookie.bigdata.springframework.beans.factory.own.service.IAccountService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class MyBeanFactoryTest
 * @Description
 * @Author rookie
 * @Date 2024/6/28 17:29
 * @Version 1.0
 */
@Slf4j
class MyBeanFactoryTest {


    @Test
    void test01(){
        //IAccountService as = new AccountServiceImpl();
        for (int i = 0; i < 5; i++) {
            IAccountService as = (IAccountService) MyBeanFactory.getBean("accountService");
            log.info("实例化对象： "+as);
            as.saveAccount();
        }
    }

}

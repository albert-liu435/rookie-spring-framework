package com.rookie.bigdata.springframework.beans.factory.own.service.impl;

import com.rookie.bigdata.springframework.beans.factory.own.MyBeanFactory;
import com.rookie.bigdata.springframework.beans.factory.own.service.IAccountDao;
import com.rookie.bigdata.springframework.beans.factory.own.service.IAccountService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class AccountServiceImpl
 * @Description 账户的业务层实现类
 * @Author rookie
 * @Date 2024/6/28 17:27
 * @Version 1.0
 */
@Slf4j
public class AccountServiceImpl implements IAccountService {



    public void saveAccount() {
         IAccountDao accountDao = (IAccountDao) MyBeanFactory.getBean("accountDao");
        int i = 1;
        accountDao.saveAccount();
        log.info("数字:" + i);
        i++;
    }
}

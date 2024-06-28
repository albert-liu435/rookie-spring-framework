package com.rookie.bigdata.springframework.beans.factory.own.service.impl;

import com.rookie.bigdata.springframework.beans.factory.own.service.IAccountDao;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class AccountDaoImpl
 * @Description 账户的持久层实现类
 * @Author rookie
 * @Date 2024/6/28 17:26
 * @Version 1.0
 */
@Slf4j
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {

        log.info("保存了账户");
    }
}

package com.rookie.bigdata.designpatterns.chainresponsibility;

import com.rookie.bigdata.designpatterns.chainresponsibility.*;
import org.junit.jupiter.api.Test;

/**
 * @Class AbstractHandlerTest
 * @Description
 * @Author rookie
 * @Date 2024/12/13 11:45
 * @Version 1.0
 */
class AbstractHandlerTest {


    @Test
    void handle() {
        AbstractHandler qingjia = new QingJia();
        AbstractHandler renshi = new RenShi();
        AbstractHandler shangjilingdao = new ShangjiLingdao();
        AbstractHandler tongshi = new TongShi();
        AbstractHandler zuZhang = new ZuZhang();

        qingjia.setNext(tongshi);
        tongshi.setNext(zuZhang);
        zuZhang.setNext(shangjilingdao);
        shangjilingdao.setNext(renshi);
        qingjia.handle("张三请假");
    }


}

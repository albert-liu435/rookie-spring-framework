package com.rookie.bigdata.springframework.context.lifecycle.structure;

/**
 * @Class Address
 * @Description https://blog.csdn.net/Sheng_Q/article/details/128277673
 * @Author rookie
 * @Date 2024/7/1 9:49
 * @Version 1.0
 */
public class Address {
    private Location location;

    public Address(Location location) {
        this.location = location;
    }

  //配置文件
//    <bean id="address" class="com.seong.inject.Address">
//    <property name="location" ref="location"/>
//    <constructor-arg name="location" ref="location"/>
//</bean>
//
//<bean id="location" class="com.seong.inject.Location">
//    <constructor-arg name="longitude" value="118"/>
//    <constructor-arg name="latitude" value="32"/>
//</bean>

}

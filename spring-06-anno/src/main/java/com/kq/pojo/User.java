package com.kq.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于bean注册<bean id="" class=""/>
//组件
@Component
public class User {

//    等价于<property name="" value="">
    @Value("kq")
    public  String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

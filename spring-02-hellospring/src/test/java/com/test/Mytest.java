package com.test;

import com.kq.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void test1(){
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理，我们要使用，直接调用
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello.toString());
    }
}

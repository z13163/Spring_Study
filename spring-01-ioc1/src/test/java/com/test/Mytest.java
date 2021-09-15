package com.test;


import com.kq.dao.UserDaoImpl;
import com.kq.dao.UserDaoMysql;
import com.kq.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void getUser(){
/*        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysql());
        userService.getUser();*/
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理，我们要使用，直接调用
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}

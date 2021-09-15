package com.kq.demo04;

import com.kq.demo02.UserService;
import com.kq.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {
        //获取真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //获取代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService) proxyInvocationHandler.Proxy();
        proxy.add();


    }
}

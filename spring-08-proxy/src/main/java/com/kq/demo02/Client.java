package com.kq.demo02;

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);

        //增加代理层，让代理层去执行操作
        proxy.add();
        proxy.delete();
    }
}

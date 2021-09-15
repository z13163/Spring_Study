package com.kq.service;

public class UserServiceImpl implements UserService{
    public int add() {
        System.out.println("增加了一个用户");
        return 1;
    }

    public void delete() {
        System.out.println("删除了一个用户");

    }

    public void update() {
        System.out.println("修改了一个用户");

    }

    public void query() {
        System.out.println("查询了一个用户");

    }
}

package com.kq.demo02;

public class UserServiceProxy implements UserService {

    UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }


    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //增加日志

    public void log(String msg){
        System.out.println("前置日志"+msg);
    }
}

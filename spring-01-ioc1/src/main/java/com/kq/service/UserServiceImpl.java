package com.kq.service;


import com.kq.dao.UserDao;
import com.kq.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

//    private UserDao userDao= new UserDaoImpl();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {

        userDao.getUser();
    }

}

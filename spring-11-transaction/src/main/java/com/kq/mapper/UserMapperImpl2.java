package com.kq.mapper;

import com.kq.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        User user1 = new User(7, "小郑", "123");
        int i = addUser(user1);
        System.out.println(i);
        int i1 = deleteUser(7);
        List<User> users = getSqlSession().getMapper(UserMapper.class).selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}

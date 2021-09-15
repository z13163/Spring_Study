package com.kq.mapper;

import com.kq.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        List<User> users = getSqlSession().getMapper(UserMapper.class).selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}

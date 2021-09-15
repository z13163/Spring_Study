package com.kq.mapper;

import com.kq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSessionTemplate;


    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public int addUser(User user) {
        return 0;
    }

    public int deleteUser(int id) {
        return 0;
    }
}

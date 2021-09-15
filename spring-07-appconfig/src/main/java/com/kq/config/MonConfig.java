package com.kq.config;


import com.kq.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonConfig {

    @Bean
    public User user(){
        return new User();
    }
}

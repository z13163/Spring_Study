package com.kq.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//唯一区别：支持获取返回值
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回了"+o);
    }
}

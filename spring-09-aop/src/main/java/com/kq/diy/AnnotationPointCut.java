package com.kq.diy;


//使用注解方式实现AOP

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.kq.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* com.kq.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

}

package com.kq.demo03;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//使用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object Proxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }


    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //可以加方法
        see();
        //动态代理的本质就是使用反射机制
        Object invokeresult = method.invoke(rent, args);
        fare();
        return invokeresult;
    }

    public void see(){
        System.out.println("中介看房");
    }
    public void fare(){
        System.out.println("支付中介费");
    }
}

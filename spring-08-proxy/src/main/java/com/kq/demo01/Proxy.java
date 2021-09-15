package com.kq.demo01;

public class Proxy implements Rent{

    private Host host;


    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        See();
        host.rent();
        hetong();
        fare();
        System.out.println("代理租房子");
    }

    //看房
    public void See(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void hetong(){
        System.out.println("签合同");
    }
}

package com.kq.demo01;

public class Client {

    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
//        host.rent();|
        //使用代理 中介帮忙房东
        Proxy proxy = new Proxy(host);

        //不同面对房东，直接找中介租房
        proxy.rent();
    }
}

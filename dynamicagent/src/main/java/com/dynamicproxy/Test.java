package com.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by liuxinxian on 16/5/26.
 */
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        WangNvShi wangNvShi = new WangNvShi();
        LiNvShi liNvShi = new LiNvShi();

        System.out.println("==========实现1=============");
        ProxyOne proxyOne = new ProxyOne(liNvShi);
        proxyOne.gouwu();
        proxyOne.guangjie();
        ProxyTwo proxyTwo = new ProxyTwo(wangNvShi);
        proxyTwo.gouwu();
        proxyTwo.guangjie();



        System.out.println("=============实现2==========");
        Class c = wangNvShi.getClass();
        DynamicProxy dynamicProxy = new DynamicProxy(liNvShi, "代理1");
        WomanKind womanKind = (WomanKind) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), dynamicProxy);
        womanKind.gouwu();
        womanKind.guangjie();
        dynamicProxy = new DynamicProxy(wangNvShi, "代理2");
        womanKind = (WomanKind)Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), dynamicProxy);
        womanKind.gouwu();
        womanKind.guangjie();
    }
}


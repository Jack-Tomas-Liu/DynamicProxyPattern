package com.dynamicproxy;

/**
 * Created by liuxinxian on 16/5/26.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object object;
    private String proxyName;
    private WomanKind womanKind;

    public DynamicProxy(Object object, String proxyName) {
        this.object = object;
        this.proxyName = proxyName;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(this.proxyName + " 逛街预处理");
        method.invoke(this.object, args);
        System.out.println(this.proxyName + " 逛街善后");
        return null;
    }
}

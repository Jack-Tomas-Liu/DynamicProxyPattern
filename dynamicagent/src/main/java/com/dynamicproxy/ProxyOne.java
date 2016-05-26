package com.dynamicproxy;

/**
 * Created by liuxinxian on 16/5/26.
 */

public class ProxyOne implements WomanKind {
    private WomanKind womanKind;

    public ProxyOne(WomanKind womanKind) {
        this.womanKind = womanKind;
    }

    public void guangjie() {
        System.out.println("代理1 逛街预处理");
        this.womanKind.guangjie();
        System.out.println("代理1 逛街善后");
    }

    public void gouwu() {
        System.out.println("代理1 购物预处理");
        this.womanKind.gouwu();
        System.out.println("代理1 购物善后");
    }
}

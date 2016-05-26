package com.dynamicproxy;

/**
 * Created by liuxinxian on 16/5/26.
 */

public class ProxyTwo implements WomanKind {
    private WomanKind womanKind;

    public ProxyTwo(WomanKind womanKind) {
        this.womanKind = womanKind;
    }

    public void guangjie() {
        System.out.println("代理2 逛街预处理");
        this.womanKind.guangjie();
        System.out.println("代理2 逛街善后");
    }

    public void gouwu() {
        System.out.println("代理2 购物预处理");
        this.womanKind.gouwu();
        System.out.println("代理2 购物善后");
    }
}


package com.dynamicproxy;

/**
 * Created by liuxinxian on 16/5/26.
 */
public class WangNvShi implements WomanKind {
    @Override
    public void guangjie() {
        System.out.println("王女士去逛街");
    }

    @Override
    public void gouwu() {
        System.out.println("王女士去购物");
    }
}

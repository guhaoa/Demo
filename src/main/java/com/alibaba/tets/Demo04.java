package com.alibaba.tets;

import java.lang.Thread.State;

/**
 * @author MSI
 * @d\ate 2017/08/03
 */
public class Demo04 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("我是多线程");
        Thread t = new Thread(runnable);
        State state = Thread.currentThread().getState();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println(state);
    }
}

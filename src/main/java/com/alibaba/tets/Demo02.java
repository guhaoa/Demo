package com.alibaba.tets;

import com.alibaba.interfaces.Consumer;

/**
 * @author MSI
 * @date 2017/07/30
 */
public class Demo02 {

    public static void main(String[] args) {
        repeat(10,i-> System.out.println("countDown : " + (9-i)));
    }


    public static void repeat(int n , Consumer consumer) {
        for (int i = 0; i < n; i++) consumer.accep(i);
    }
}

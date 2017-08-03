package com.alibaba.interfaces;

/**
 * @author MSI
 * @date 2017/07/30
 */
public interface Named {

    default String getName() {
        return this.getClass()+ "Named";
    }
}

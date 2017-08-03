package com.alibaba.interfaces;

import lombok.Data;

/**
 * @author MSI
 * @date 2017/07/30
 */
@Data
public class Person {
    private String name;
    private String age;

    public Person(String name) {
        this.name = name;
    }


}

package com.alibaba.tets;

import lombok.Data;

/**
 * @author MSI
 * @date 2017/08/12
 */

public class FeatureTest {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

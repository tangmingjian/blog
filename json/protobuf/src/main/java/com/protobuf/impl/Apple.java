package com.protobuf.impl;

import com.protobuf.Fruit;

public class Apple implements Fruit {

    private String name;

    public Apple() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName = " + name);
        this.name = name;
    }

}

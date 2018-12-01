package com.infoshareacademy.carmock;

public class Car {

    private Type type;

    public String getTypeName() {
        return type.getName()
                .toUpperCase();
    }
}

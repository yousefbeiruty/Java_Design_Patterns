package com.example.corepatterns.patterns.creational.signleton;

public enum EnumSingletonDemo {
    INSTANCE;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

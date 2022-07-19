package com.example.corepatterns.patterns.signleton;

public class TestEnumSingelton {

    public static void main(String[] args) {
        EnumSingletonDemo instance=EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Yousef");
        System.out.println(instance.getName());

    }
}

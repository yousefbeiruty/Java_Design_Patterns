package com.example.corepatterns.patterns.creational.abstractfactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department to XML");
    }
}

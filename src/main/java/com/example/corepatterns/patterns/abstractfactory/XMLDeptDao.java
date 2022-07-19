package com.example.corepatterns.patterns.abstractfactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department to XML");
    }
}

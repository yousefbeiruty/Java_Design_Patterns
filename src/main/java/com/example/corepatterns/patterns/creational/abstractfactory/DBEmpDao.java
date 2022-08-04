 package com.example.corepatterns.patterns.creational.abstractfactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}

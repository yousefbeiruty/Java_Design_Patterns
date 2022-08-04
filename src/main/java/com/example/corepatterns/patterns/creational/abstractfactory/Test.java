package com.example.corepatterns.patterns.creational.abstractfactory;

public class Test {

    public static void main(String[] args) {
        DaoAbstractFactory xmlFactory= DaoFactoryProducer.produce("xml");
        Dao dao=xmlFactory.createDao("emp");
        dao.save();

        DaoAbstractFactory dbFactory= DaoFactoryProducer.produce("db");
        Dao dao2= dbFactory.createDao("emp");
        dao2.save();

    }
}

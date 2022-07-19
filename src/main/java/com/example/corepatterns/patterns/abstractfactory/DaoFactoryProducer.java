package com.example.corepatterns.patterns.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daoAbstractFactory=null;

        switch (factoryType){
            case "xml":daoAbstractFactory=new XMLDaoFactory();
            break;
            case "db":daoAbstractFactory=new DBDaoFactory();
        }
        return daoAbstractFactory;
    }
}

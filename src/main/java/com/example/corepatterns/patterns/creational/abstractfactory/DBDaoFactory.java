package com.example.corepatterns.patterns.creational.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao=null;
        switch (type){
            case "emp":dao= new DBEmpDao();
            break;
            case "dept":dao=new DBDeptDao();
        }
        return dao;
    }
}

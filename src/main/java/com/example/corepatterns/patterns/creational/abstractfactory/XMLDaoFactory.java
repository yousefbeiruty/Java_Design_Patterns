package com.example.corepatterns.patterns.creational.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao=null;
        switch (type){
            case "emp":dao= new XMLEmpDao();
            break;
            case "dept":dao=new XMLDeptDao();
        }
        return dao;
    }
}

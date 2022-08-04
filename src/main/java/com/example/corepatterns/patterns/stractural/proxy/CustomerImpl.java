package com.example.corepatterns.patterns.stractural.proxy;

import java.util.List;

public class CustomerImpl implements Customer{

    private int id;
    private List<Orders>orders;

    CustomerImpl(){
        this.id=123;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Orders> getOrders() {
        return orders;
    }
}

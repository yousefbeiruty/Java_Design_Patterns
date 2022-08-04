package com.example.corepatterns.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Orders> getOrders() {
        ArrayList<Orders> orders = new ArrayList<Orders>();
        Orders order = new Orders();
        order.setId(1);
        order.setQuantity(2);
        order.setProductName("Adidas");
        Orders order2 = new Orders();
        order2.setId(2);
        order2.setQuantity(3);
        order2.setProductName("Iphone");

        orders.add(order);
        orders.add(order2);
        return orders;
    }
}

package com.example.corepatterns.patterns.proxy;

import java.util.List;

public interface Customer {
    int getId();
    List<Orders> getOrders();
}

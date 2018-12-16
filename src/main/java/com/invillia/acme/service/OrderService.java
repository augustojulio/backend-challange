package com.invillia.acme.service;

import java.util.List;

import com.invillia.acme.model.Order;

//defining all the methods that controller can access

public interface OrderService {
 Order createOrder(Order order);
 Order getOrder(String id);
 List<Order> listOrders();
 
}
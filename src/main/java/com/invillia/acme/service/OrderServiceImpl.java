
package com.invillia.acme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.invillia.acme.model.Order;

import com.invillia.acme.repository.OrderRepository;

//implementing the business rules

@Service
public class OrderServiceImpl implements OrderService {

@Autowired
 private OrderRepository orderRepository;

@SuppressWarnings("finally")
 private Order findOne(String Id) {

 Order instance = null;
  try {
   List < Order > orderList = orderRepository.findAll();
   for (Order order: orderList) {
    if (order.getId().equals(Id)) {
     instance = order;
     break;
    }
   }
  } catch(Exception e) {
   e.printStackTrace();
  } finally {
   return instance;
  }
 }

@Override
 public Order createOrder(Order order) {
  return orderRepository.save(order);
 }

@Override
 public List < Order > listOrders() {
  return orderRepository.findAll();
 }

@Override
 public Order getOrder(String id) {

  return this.findOne(id);
 }
 
}
package com.invillia.acme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.invillia.acme.model.Order;
import com.invillia.acme.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

@Autowired
 private OrderService orderService;

@RequestMapping(method = RequestMethod.POST)
 public Order createOrder(@RequestBody Order order) {

return orderService.createOrder(order);
}

@RequestMapping(method = RequestMethod.GET)
 public List < Order > listOrders() {
  return orderService.listOrders();
}

@RequestMapping(value = "/{id}", method = RequestMethod.GET)
 public Order getOrder(@PathVariable String id) {
  return orderService.getOrder(id);
}

}
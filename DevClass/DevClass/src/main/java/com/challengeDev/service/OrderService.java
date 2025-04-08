package com.challengeDev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challengeDev.entities.Order;

@Service
public class OrderService {

    @Autowired // auto dependence injection
    private ShippingService shippingService;

    public double total(Order order) {
        return (order.getBasicValue() - (order.getBasicValue() * (order.getDiscount()/100)) + shippingService.shipment(order));
    }
}

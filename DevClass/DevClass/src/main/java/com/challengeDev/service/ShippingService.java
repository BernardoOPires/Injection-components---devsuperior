package com.challengeDev.service;

import org.springframework.stereotype.Service;

import com.challengeDev.entities.Order;


@Service
public class ShippingService {
    
    private double Shipping;

   public double shipment(Order order){
      if (order.getBasicValue() < 100){
        Shipping = 20;
      }else if (order.getBasicValue() >= 100 && order.getBasicValue() < 200) {
        Shipping = 12;
      }else{
        Shipping = 0;
      }
      return Shipping;
   }

}

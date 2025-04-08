package com.challengeDev.DevClass;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.challengeDev.entities.Order;
import com.challengeDev.service.OrderService;

@SpringBootApplication
@ComponentScan({"com.challengeDev"})
public class DevClassApplication implements CommandLineRunner{

	private OrderService OrderService;
	
	public DevClassApplication(com.challengeDev.service.OrderService orderService) {
		OrderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DevClassApplication.class, args);
	}

	

	public void run (String... arg) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Inser code(int), order Value(double) and discount value(double): ");
		Order order = new Order(sc.nextInt(), sc.nextDouble(), sc.nextDouble());
        sc.close();

		System.out.println("Pedido código: " + order.getCode());
		String result = String.format("Valor total: R$ %.2f", OrderService.total(order));
		System.out.println(result); 
	} 

}

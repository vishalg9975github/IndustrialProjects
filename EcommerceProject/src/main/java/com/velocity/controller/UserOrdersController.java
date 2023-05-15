package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Orders;
import com.velocity.model.User;
import com.velocity.service.OrdersServices;
import com.velocity.service.UserService;

@RestController
public class UserOrdersController {

	// inject both services here

	@Autowired
	private UserService userService;

	@Autowired
	private OrdersServices ordersServices;

	@PostMapping("/UserOrder")
	public User saveUserOrder(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		List<Orders> orderList = user.getOrdersList();
		for (Orders orders : orderList) {
			orders.setUserId(user.getId());
			ordersServices.saveOrders(orders);
		}
		return user1;

	}

}

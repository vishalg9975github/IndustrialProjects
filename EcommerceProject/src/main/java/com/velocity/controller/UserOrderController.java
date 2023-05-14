package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Orders;
import com.velocity.model.Reimbursement;
import com.velocity.model.User;
import com.velocity.service.OrdersService;
import com.velocity.service.UserService;

@RestController
public class UserOrderController {

	@Autowired
	private UserService userService;
	@Autowired
	private OrdersService orderService;

	@GetMapping("/getUserOrder")
	public List<User> getUserOrder() {
		return userService.getUser();
	}

	public List<Orders> getOrders() {
		return orderService.getOrder();
	}

}

package com.velocity.service;

import java.util.List;

import com.velocity.model.Orders;

public interface OrderService {
	
	public Orders updateOrder(Orders order);
	public void deletById(int orderId);
}

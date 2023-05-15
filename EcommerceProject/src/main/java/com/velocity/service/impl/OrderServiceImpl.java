package com.velocity.service.impl;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Orders;
import com.velocity.repository.OrderRepository;
import com.velocity.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Orders updateOrder(Orders order) {
		Integer oid=order.getOrderId();
		Orders order1=orderRepository.findById(oid).get();
		order1.setProductName(order.getProductName());
		order1.setPrice(order.getPrice());
		order1.setQuantity(order.getQuantity());
		order1.setUserId(order.getUserId()); 
	   return orderRepository.save(order1);
	}

	@Override
	public void deletById(int orderId) {
		orderRepository.deleteById(orderId);
		
	}

}

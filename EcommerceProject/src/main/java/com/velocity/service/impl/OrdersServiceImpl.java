package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Orders;
import com.velocity.repository.OrdersRepository;
import com.velocity.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository orderRepository;

	@Override
	public List<Orders> getOrder() {
		List<Orders> list = orderRepository.findAll();
		return list;
	}

}

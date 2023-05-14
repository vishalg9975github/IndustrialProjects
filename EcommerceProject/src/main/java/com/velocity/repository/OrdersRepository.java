package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}

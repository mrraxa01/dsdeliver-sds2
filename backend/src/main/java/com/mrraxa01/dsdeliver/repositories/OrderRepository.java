package com.mrraxa01.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrraxa01.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

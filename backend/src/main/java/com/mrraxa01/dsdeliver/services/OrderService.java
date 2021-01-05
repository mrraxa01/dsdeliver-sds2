package com.mrraxa01.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrraxa01.dsdeliver.dto.OrderDTO;
import com.mrraxa01.dsdeliver.dto.ProductDTO;
import com.mrraxa01.dsdeliver.entities.Order;
import com.mrraxa01.dsdeliver.entities.OrderStatus;
import com.mrraxa01.dsdeliver.entities.Product;
import com.mrraxa01.dsdeliver.repositories.OrderRepository;
import com.mrraxa01.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){	
		
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDTO insert(OrderDTO dto){
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
			}
			order = repository.save(order);
			return new OrderDTO(order);
		
	}
	@Transactional
	public OrderDTO setDelivered(Long id){
		Order order = repository.getOne(id);
		order.setStatus(OrderStatus.DELIVERED);
		order = repository.save(order);
		return new OrderDTO(order);
		
	}
}

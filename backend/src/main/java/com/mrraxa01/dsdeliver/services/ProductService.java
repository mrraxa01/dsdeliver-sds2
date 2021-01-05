package com.mrraxa01.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrraxa01.dsdeliver.dto.ProductDTO;
import com.mrraxa01.dsdeliver.entities.Product;
import com.mrraxa01.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<ProductDTO> findAll(){
		
		//@Transactional(readOnly = true)
		List<Product> list = repository.findByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
		
	}
}

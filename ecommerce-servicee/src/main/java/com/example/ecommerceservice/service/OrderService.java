package com.example.ecommerceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerceservice.entity.Ordering;

import com.example.ecommerceservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Ordering> getAll(){
		return orderRepository.findAll();
	}
	
	public Ordering create(Ordering ordering) {
		return orderRepository.save(ordering);
	}
	
	public Ordering update(Ordering ordering) {
		return orderRepository.save(ordering);
	}
	
	public void deleteOneById(int id) {
		orderRepository.deleteById(id);
	}
}

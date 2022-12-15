package com.example.ecommerceservice.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerceservice.entity.Ordering;

import com.example.ecommerceservice.repository.OrderRepository;

@Service
public class OrderDaoService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Ordering> getAll(){
		List<Ordering> orders=orderRepository.findAll();
		return orders;
	}
	
	public Ordering getOneById(int id) {
		Optional<Ordering> optionalOrdering=orderRepository.findById(id);
		return optionalOrdering.get();
	}
	
	public Ordering create(Ordering ordering) {
		Ordering result=orderRepository.save(ordering);
		return result;
	}
	
	public Ordering update(Ordering ordering) {
		Ordering result=orderRepository.save(ordering);
		return result;
	}
	
	public void delete(int id) {
		orderRepository.deleteById(id);
	}
}

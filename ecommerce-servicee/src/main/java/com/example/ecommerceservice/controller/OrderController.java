package com.example.ecommerceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.ecommerceservice.entity.Ordering;

import com.example.ecommerceservice.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/ecommerce_service/ordering")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/get/{id}")
	public List<Ordering> getAll(){
		return orderService.getAll();
	}
	
	@PostMapping("/create")
	public Ordering create(@RequestBody Ordering ordering){
		return orderService.create(ordering);
	}
	
	@PutMapping("/update")
	public Ordering update(@RequestBody Ordering ordering) {
		return orderService.update(ordering);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneById(@PathVariable int id) {
		orderService.deleteOneById(id);
	}
}

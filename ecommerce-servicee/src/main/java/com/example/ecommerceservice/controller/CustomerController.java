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


import com.example.ecommerceservice.entity.Customer;

import com.example.ecommerceservice.service.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/api/ecommerce_service/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/get/{id}")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@PostMapping("/create")
	public Customer create(@RequestBody Customer customer) {
		return customerService.create(customer);
	}
	
	@PutMapping("/update")
	public Customer update(@RequestBody Customer customer) {
		return customerService.update(customer);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneById(@PathVariable int id) {
		customerService.deleteOneById(id);
	}
}

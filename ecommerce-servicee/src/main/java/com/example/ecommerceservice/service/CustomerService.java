package com.example.ecommerceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceservice.entity.Customer;
import com.example.ecommerceservice.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAll(){
		return customerRepository.findAll();
	}
	
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public void deleteOneById(int id) {
		customerRepository.deleteById(id);
	}

	
}

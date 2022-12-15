package com.example.ecommerceservice.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerceservice.entity.Customer;

import com.example.ecommerceservice.repository.CustomerRepository;

@Service
public class CustomerDaoService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll(){
		List<Customer> customers=customerRepository.findAll();
		return customers;
	}
	
	public Customer getOneById(int id) {
		Optional<Customer> optionalCustomer=customerRepository.findById(id);
		return optionalCustomer.get();
	}
	
	public Customer create(Customer customer) {
		Customer result=customerRepository.save(customer);
		return result;
	}
	
	public  Customer update(Customer customer) {
		 Customer result= customerRepository.save(customer);
		return result;
	}
	
	public void delete(int id) {
		 customerRepository.deleteById(id);
	}
}

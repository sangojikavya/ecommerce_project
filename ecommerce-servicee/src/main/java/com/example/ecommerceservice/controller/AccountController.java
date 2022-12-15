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

import com.example.ecommerceservice.entity.Account;
import com.example.ecommerceservice.service.AccountService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/ecommerce_service/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/get/{id}")
	public List<Account> getAll(){
		return accountService.getAll();
	}
	
	@PostMapping("/create")
	public Account create(@RequestBody Account account) {
		return accountService.create(account);
	}
	
	@PutMapping("/update")
	public Account update(@RequestBody Account account) {
		return accountService.update(account);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneById(@PathVariable int id) {
		accountService.deleteOneById(id);
	}
}

package com.example.ecommerceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceservice.entity.Account;
import com.example.ecommerceservice.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAll(){
		return accountRepository.findAll();
	}
	
	public Account create(Account account) {
		return accountRepository.save(account);
	}
	
	public Account update(Account account) {
		return accountRepository.save(account);
	}
	
	public void deleteOneById(int id) {
		accountRepository.deleteById(id);
	}
}

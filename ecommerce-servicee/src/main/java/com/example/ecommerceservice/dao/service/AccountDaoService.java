package com.example.ecommerceservice.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerceservice.entity.Account;
import com.example.ecommerceservice.repository.AccountRepository;

@Service
public class AccountDaoService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAll(){
		List<Account> accounts=accountRepository.findAll();
		return accounts;
	}
	
	public Account getOneById(int id) {
		Optional<Account> optionalAccount=accountRepository.findById(id);
		return optionalAccount.get();
	}
	
	public Account create(Account account) {
		Account result=accountRepository.save(account);
		return result;
	}
	
	public Account update(Account account) {
		Account result=accountRepository.save(account);
		return result;
	}
	
	public void delete(int id) {
		accountRepository.deleteById(id);
	}
}

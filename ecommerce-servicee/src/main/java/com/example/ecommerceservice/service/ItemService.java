package com.example.ecommerceservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerceservice.entity.Item;

import com.example.ecommerceservice.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAll(){
		return  itemRepository.findAll();
	}
	
	public Item create(Item item) {
		return  itemRepository.save(item);
	}
	
	public Item update(Item item) {
		return  itemRepository.save(item);
	}
	
	public void deleteOneById(int id) {
		 itemRepository.deleteById(id);
	}
}

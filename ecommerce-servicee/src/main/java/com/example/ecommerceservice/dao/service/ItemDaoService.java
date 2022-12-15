package com.example.ecommerceservice.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecommerceservice.entity.Item;

import com.example.ecommerceservice.repository.ItemRepository;

@Service
public class ItemDaoService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAll(){
		List<Item> items=itemRepository.findAll();
		return items;
	}
	
	public Item getOneById(int id) {
		Optional<Item> optionalItem=itemRepository.findById(id);
		return optionalItem.get();
	}
	
	public Item create(Item item) {
	 Item result=itemRepository.save(item);
		return result;
	}
	
	public Item update(Item item) {
		 Item result=itemRepository.save(item);
			return result;
		}
	
	public void delete(int id) {
		itemRepository.deleteById(id);
	}
}

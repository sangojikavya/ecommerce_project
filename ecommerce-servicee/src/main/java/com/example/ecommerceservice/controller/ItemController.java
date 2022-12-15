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


import com.example.ecommerceservice.entity.Item;

import com.example.ecommerceservice.service.ItemService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/ecommerce_service/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping("/get/{id}")
	public List<Item> getAll(){
		return itemService.getAll();
	}
	
	@PostMapping("/create")
	public Item create(@RequestBody Item item){
		return itemService.create(item);
	}
	
	@PutMapping("/update")
	public Item update(@RequestBody Item item) {
		return itemService.update(item);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneById(@PathVariable int id) {
		itemService.deleteOneById(id);
	}
}

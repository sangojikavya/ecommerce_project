package com.example.ecommerceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="name",length=40)
	private String name;
	
	@Column(name="description",length=40)
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}

package com.example.ecommerceservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account {
	
    @Id
    @GeneratedValue
	private int id;
	
    @Column(name="type", length=20)
	private String type;
	
    @Column(name="description", length=20)
	private String description;
	
    @Column(name="createdOn")
	private Date createdOn;
	
    @javax.persistence.OneToMany(cascade=javax.persistence.CascadeType.ALL)
	@javax.persistence.JoinColumn(name="Ordering_id", referencedColumnName="id")
	private List<Ordering> ordering;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	
	public List<Ordering> getOrdering() {
		return ordering;
	}
	public void setOrdering(List<Ordering> ordering) {
		this.ordering = ordering;
	}
	
	
	public Account(int id, String type, String description, Date createdOn, List<Ordering> ordering) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.createdOn = createdOn;
		this.ordering = ordering;
	}
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", description=" + description + ", createdOn=" + createdOn
				+ ", ordering=" + ordering + "]";
	}
	@PrePersist
	public void createdOn() {
		this.createdOn=new Date();
	}
	
	
}

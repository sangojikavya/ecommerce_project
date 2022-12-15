package com.example.ecommerceservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ordering")
public class Ordering {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="isPaymentDone")
	private boolean isPaymentDone;
	
	@Column(name="placedOn")
	private Date placedOn;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="item_id",referencedColumnName = "id")
	private List<Item> item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPaymentDone() {
		return isPaymentDone;
	}

	public void setPaymentDone(boolean isPaymentDone) {
		this.isPaymentDone = isPaymentDone;
	}

	public Date getPlacedOn() {
		return placedOn;
	}

	public void setPlacedOn(Date placedOn) {
		this.placedOn = placedOn;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Ordering(int id, boolean isPaymentDone, Date placedOn, List<Item> item) {
		super();
		this.id = id;
		this.isPaymentDone = isPaymentDone;
		this.placedOn = placedOn;
		this.item = item;
	}

	public Ordering() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ordering [id=" + id + ", isPaymentDone=" + isPaymentDone + ", placedOn=" + placedOn + ", item=" + item
				+ "]";
	}
	
	
}

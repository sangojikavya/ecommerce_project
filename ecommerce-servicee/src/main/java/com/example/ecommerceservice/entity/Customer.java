package com.example.ecommerceservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstName", length=20)
	private String firstName;
	
	@Column(name="lastName", length=20)
	private String lastName;
	
	@Column(name="mobileNumber")
	private long mobileNumber;
	
	@Column(name="email", length=40)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Account account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer(int id, String firstName, String lastName, long mobileNumber, String email, Account account) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.account = account;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", account=" + account + "]";
	}
	
}

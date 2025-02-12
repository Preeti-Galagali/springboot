package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer (String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer[id = " + id + ", name = " + name + " , email = " + email + "]";
	}

}

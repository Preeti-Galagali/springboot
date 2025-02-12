package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandLineRunner implements CommandLineRunner {

	private final CustomerRepository repository;
	
	public  CustomerCommandLineRunner(CustomerRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}

	
	@Override
	public void run(String... args) {
		
		repository.save(new Customer("Alice", "alice@gmail.com"));
		repository.save(new Customer("Bob", "bob@gmail.com"));
		repository.save(new Customer("Charlie", "charlie@gmail.com"));
		repository.save(new Customer("Devi", "devi@gmail.com"));
		repository.save(new Customer("Eve", "eve@gmail.com"));
		
		// print all customers
		System.out.println("Customers found with findAll():");
		repository.findAll().forEach(System.out::println);
		
		// find by id
		System.out.println("Customers found with findById(1L):");
		repository.findById(1L).ifPresent(System.out::println);
		
		// find by name
		System.out.println("Customers found with findByName('Alice'):");
		repository.findByName("Alice").forEach(System.out::println);
	}
}

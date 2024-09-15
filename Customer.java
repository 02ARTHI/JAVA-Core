package com.jim.learning;

public class Customer {

	
	private String name;
	private int creditLimit;
	private String email;
	
	public String getName() {
		return name;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
		
		this("arthi", 200000, "arthi2919@gmail.com");
		System.out.println("default constructor");
	}
	public Customer(String name, int creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
		
		System.out.println("name " + name+" credit limit " +creditLimit);
	}
	
	public Customer(String name, String email)
	{
        this(name,9000,email);
   }
	
	
	
	
	
}

package org.test.contructor;

public class Company {
	
	public Company() {
	
		System.out.println("Default Constructor");
	}
	
	public Company(int id) {
		this("susant");
		System.out.println("Parameterized Constructor is Interger");
	}
	
	
	public Company(String text) {
		this();
		System.out.println("Parameterized Constructor is String");
	}
	
	
}

package org.test.contructor;

public class Employee extends Company{

	public Employee(int a) {
		this("Pooja");
		
		System.out.println("Child class Parameterized constructor Integer");
	}

	public Employee(String name) {
		super(12);
		System.out.println("Child class Parameterized constructor String");
		

	}
	public static void main(String[] args) {
		Employee e = new Employee(20);
	}
}

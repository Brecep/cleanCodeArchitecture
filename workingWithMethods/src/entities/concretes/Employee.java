package entities.concretes;

import entities.abstracts.Person;

public class Employee extends Person {
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, double salary) {
		super(id, firstName, lastName, identityNumber, yearOfBirth);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

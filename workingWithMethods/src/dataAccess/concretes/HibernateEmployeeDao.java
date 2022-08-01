package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.EmployeeDao;
import entities.concretes.Employee;

public class HibernateEmployeeDao implements EmployeeDao{

	@Override
	public List<Employee> getAll() {
		System.out.println("Hibernate ile calisanlar listelendi");
		return null;
	}

}

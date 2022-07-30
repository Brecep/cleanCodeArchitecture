package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface EmployeeDao {
	List<Employee> getAll();
}

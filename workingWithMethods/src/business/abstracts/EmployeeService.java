package business.abstracts;

import java.util.List;

import entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}

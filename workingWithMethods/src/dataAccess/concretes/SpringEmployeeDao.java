package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.EmployeeDao;
import entities.concretes.Employee;

public class SpringEmployeeDao implements EmployeeDao {

	List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> getAll() {
		employees.add(new Employee(1, "Engin", "Demirog", "12345665911", 1983, 5500));
		employees.add(new Employee(2, "Engin1", "Demirog", "12345665911", 1983, 5500));
		employees.add(new Employee(3, "Engin2", "Demirog", "12345665911", 1983, 5500));
		employees.add(new Employee(4, "Engin3", "Demirog", "12345665911", 1983, 5500));
		System.out.println("Spring ile listeleme yapildi!");
		return employees;
	}

}

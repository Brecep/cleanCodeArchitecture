package business.abstracts;

import java.util.List;

import dataAccess.abstracts.EmployeeDao;
import entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.getAll();
	}
	
}

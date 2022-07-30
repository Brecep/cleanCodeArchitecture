package api;

import business.abstracts.CustomerService;
import business.abstracts.EmployeeManager;
import business.abstracts.EmployeeService;
import business.concretes.CustomerManager;
import core.utilities.adapter.concretes.KpsServiceAdapter;
import dataAccess.concretes.JdbcCustomerDao;
import dataAccess.concretes.SpringEmployeeDao;
import entities.concretes.Customer;
import entities.concretes.Employee;

public class Main {

	public static void main(String[] args) throws Exception {

		emloyeeDemo();
		customerDemo();

	}

	private static void customerDemo() throws Exception {
		CustomerService customerService = new CustomerManager(new JdbcCustomerDao(), new KpsServiceAdapter());
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();

		customer1.setFirstName("R");
		customer1.setLastName("Bayindir");
		customer1.setIdentityNumber("222");

		customer2.setFirstName("Recep2");
		customer2.setLastName("Bayindir");
		customer2.setIdentityNumber("222");
		customer2.setCityId(2);

		customer3.setFirstName("Recep3");
		customer3.setLastName("Bayindir");
		customer3.setIdentityNumber("222");

		customerService.add(customer1);
		customerService.add(customer2);
		customerService.add(customer3);
	}

	private static void emloyeeDemo() {
		EmployeeService employeeService = new EmployeeManager(new SpringEmployeeDao());
		for (Employee item : employeeService.getAll()) {
			System.out.println(item.getFirstName());
		}
	}

}

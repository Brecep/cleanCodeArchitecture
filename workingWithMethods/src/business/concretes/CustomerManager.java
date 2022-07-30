package business.concretes;
import business.abstracts.CustomerService;
import core.utilities.adapter.abstracts.PersonService;
import dataAccess.abstracts.CustomerDao;
import entities.abstracts.Person;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	private PersonService personService;

	public CustomerManager(CustomerDao customerDao, PersonService personService) {
		super();
		this.customerDao = customerDao;
		this.personService = personService;
	}
	
	//Müşteri eklemeye yarar
	public void add(Customer customer) throws Exception {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		
		checkPersonExists(customer);
		
		this.customerDao.customerExists(customer);
		this.customerDao.add(customer);

	}

	public void addByOtherBusiness(Customer customer) throws Exception {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateIdentityNumberIfEmpty(customer);
		validateFirstNameLenght(customer);

		checkCustomerExists(customer);
		this.customerDao.add(customer);

	}

	private void checkCustomerExists(Customer customer) throws Exception {

		if (this.customerDao.customerExists(customer)) {
			throw new Exception("Musteri zaten mevcut");
		}
	}
	
	private void checkPersonExists(Person person) throws Exception {
		if(!personService.checkPerson(person)) {
			throw new Exception("Kisi bilgileri hatali");
		}
	}
	
	private void validateFirstNameIfEmpty(Customer customer) throws Exception {
		if (customer.getFirstName().isEmpty()) {
			throw new Exception("Validasyon hatası oldu !");
		}

	}

	private void validateLastNameIfEmpty(Customer customer) throws Exception {
		if (customer.getLastName().isEmpty()) {
			throw new Exception("Validasyon hatası oldu !");
		}

	}

	private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {
		if (customer.getIdentityNumber().isEmpty()) {
			throw new Exception("Validasyon hatası oldu !");
		}

	}

	private void validateFirstNameLenght(Customer customer) throws Exception {
		if (customer.getFirstName().length() < 2) {
			throw new Exception("Validasyon hatası oldu !");
		}

	}
}

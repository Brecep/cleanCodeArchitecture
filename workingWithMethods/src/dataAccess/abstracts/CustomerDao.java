package dataAccess.abstracts;
import entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	boolean customerExists(Customer customer);
}

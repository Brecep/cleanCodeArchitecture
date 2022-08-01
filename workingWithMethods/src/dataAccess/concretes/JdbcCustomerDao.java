package dataAccess.concretes;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class JdbcCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("JDBC kullanarak veritabanına eklendi");
	}

	@Override
	public boolean customerExists(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
}

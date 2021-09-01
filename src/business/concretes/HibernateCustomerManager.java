package business.concretes;

import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;

public class HibernateCustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	public HibernateCustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void add() {
		customerDao.add();
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	public void signUp() {
		// TODO Auto-generated method stub
		
	}

}

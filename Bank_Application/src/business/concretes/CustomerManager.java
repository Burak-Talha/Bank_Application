package business.concretes;

import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;

public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	
	@Override
	public void add() {
		customerDao.add();
	}
	
	@Override
	public void update() {
		customerDao.update();
	}
	
	@Override
	public void delete() {
		customerDao.delete();
	}
	
	@Override
	public void signIn() {
		customerDao.signIn();
	}

	@Override
	public void logIn() {
		customerDao.logIn();
	}

}

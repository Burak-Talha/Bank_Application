package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.subClasses.CorporateCustomer;

public class HibernateCorporateCustomerDao implements CustomerDao  {
	
	private CorporateCustomer corporateCustomer;

	public HibernateCorporateCustomerDao(CorporateCustomer corporateCustomer) {
		this.corporateCustomer = corporateCustomer;
	}

	public void add() {
		// TODO Auto-generated method stub
		
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

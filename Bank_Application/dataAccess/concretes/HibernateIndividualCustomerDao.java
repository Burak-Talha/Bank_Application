package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.subClasses.IndividualCustomer;

public class HibernateIndividualCustomerDao implements CustomerDao {
	
	private IndividualCustomer individualCustomer;

	public HibernateIndividualCustomerDao(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
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

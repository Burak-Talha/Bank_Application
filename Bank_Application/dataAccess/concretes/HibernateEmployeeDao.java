package dataAccess.concretes;

import dataAccess.abstracts.StaffDao;
import entities.concretes.subClasses.Employee;

public class HibernateEmployeeDao implements StaffDao{
	
	private Employee employee;
	

	public HibernateEmployeeDao(Employee employee) {
		this.employee = employee;
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

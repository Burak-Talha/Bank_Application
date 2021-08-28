package dataAccess.abstracts;

import entities.abstracts.Staff;

public interface StaffDao <T extends Staff> {
	public void add(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void signIn(T entity);
	public void logIn(T entity);

}

package dataAccess.abstracts;

import entities.abstracts.Customer;

public interface CustomerDao <T extends Customer> {

public void add(T entity);
public void update(T entity);
public void delete(T entity);
public void signIn(T entity);
public void logIn(T entity);



}

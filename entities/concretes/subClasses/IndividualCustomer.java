package entities.concretes.subClasses;

import entities.abstracts.Customer;
import entities.concretes.superClasses.Customers;

public class IndividualCustomer extends Customers implements Customer {
private int customerId;
private int id;
private String firstName;
private String lastName;
private String TC;
private int birthYear;

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getTC() {
	return TC;
}
public void setTC(String tC) {
	TC = tC;
}
public int getBirthYear() {
	return birthYear;
}
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
}

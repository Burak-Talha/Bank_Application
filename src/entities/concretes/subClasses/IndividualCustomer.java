package entities.concretes.subClasses;

import javax.persistence.*;

import entities.abstracts.Customer;
import entities.concretes.superClasses.Customers;

@Entity
@Table(name="individualcustomer")
public class IndividualCustomer extends Customers implements Customer {

@Id
@Column(name="id")
private int id;

@Column(name="customers_id")
private int customerId;

@Column(name="userName")
private String userName;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="TC")
private String TC;

@Column(name="email")
private String email;

@Column(name="password")
private String password;

@Column(name="BirthYear")
private int birthYear;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
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

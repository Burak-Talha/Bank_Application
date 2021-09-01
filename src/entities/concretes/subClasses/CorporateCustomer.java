package entities.concretes.subClasses;

import javax.persistence.*;

import entities.abstracts.Customer;
import entities.concretes.superClasses.Customers;
@Entity
@Table(name="corporatecustomer")
public class CorporateCustomer extends Customers  implements Customer{
@Id
@Column(name="id")
private int id;

@Column(name="customers_id")
private int customerId;

@Column(name="companyName")
private String corporateName;

@Column(name="taxNumber")
private String taxNumber;

@Column(name="email")
private String email;

@Column(name="password")
private String password;


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public String getCorporateName() {
	return corporateName;
}
public void setCorporateName(String corporateName) {
	this.corporateName = corporateName;
}
public String getTaxNumber() {
	return taxNumber;
}
public void setTaxNumber(String taxNumber) {
	this.taxNumber = taxNumber;
}


}

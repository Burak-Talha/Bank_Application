package entities.concretes.subClasses;

import entities.abstracts.Customer;
import entities.concretes.superClasses.Customers;

public class CorporateCustomer extends Customers  implements Customer{
private int customerId;
private int id;
private String corporateName;
private String taxNumber;
private String phoneNumber;

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
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

}

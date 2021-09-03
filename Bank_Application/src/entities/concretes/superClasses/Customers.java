package entities.concretes.superClasses;

import javax.persistence.*;


@Table(name="customers")
public class Customers {

@Id
@Column(name="customers_id")
private int customersId;

@Column(name="customers_name")
private String customersName;

public int getCustomersId() {
	return customersId;
}
public void setCustomersId(int customersId) {
	this.customersId = customersId;
}
public String getCustomersName() {
	return customersName;
}
public void setCustomersName(String customersName) {
	this.customersName = customersName;
}

}

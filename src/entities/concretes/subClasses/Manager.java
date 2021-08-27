package entities.concretes.subClasses;



import javax.persistence.*;

import entities.abstracts.Staff;
import entities.concretes.superClasses.Staffs;

@Entity
@Table(name="manager")
public class Manager extends Staffs implements Staff {
	
@Id
@Column(name="id")
private int id;

@Column(name="staffs_id")
private int staffs_id;

@Column(name="FirstName")
private String firstName;

@Column(name="LastName")
private String lastName;

@Column(name="TC")
private String TC;

@Column(name="BirthYear")
private int birthYear;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getStaffs_id() {
	return staffs_id;
}
public void setStaffs_id(int staffs_id) {
	this.staffs_id = staffs_id;
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

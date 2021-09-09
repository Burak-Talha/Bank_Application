package entities.concretes.subClasses;



import entities.abstracts.Staff;
import entities.concretes.superClasses.Staffs;

public class AsisstansDirector extends Staffs implements Staff  {
	private int id;
	private int staffs_id;
	private int firstName;
	private int lastName;
	private String TC;
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
	public int getFirstName() {
		return firstName;
	}
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	public int getLastName() {
		return lastName;
	}
	public void setLastName(int lastName) {
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

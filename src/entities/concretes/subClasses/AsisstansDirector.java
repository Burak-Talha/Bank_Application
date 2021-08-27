package entities.concretes.subClasses;





import javax.persistence.*;


import entities.abstracts.Staff;
import entities.concretes.superClasses.Staffs;
@Entity
@Table(name="asisstans_director")
public class AsisstansDirector extends Staffs implements Staff  {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="staffs_id")
	private int staffs_id;
	@Column(name="FirstName")
	private int firstName;
	@Column(name="LastName")
	private int lastName;
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

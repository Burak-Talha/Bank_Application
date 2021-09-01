package dataAccess.concretes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dataAccess.abstracts.StaffDao;
import entities.concretes.subClasses.CorporateCustomer;
import entities.concretes.subClasses.Employee;

public class HibernateEmployeeDao implements StaffDao<Employee>{
	
	private int id;
	private int staffs_id;
	private String firstName;
	private String lastName;
	private String TC;
	private int birthYear;
	private String email;
	private String password;

	public HibernateEmployeeDao(int id, int staffs_id, String firstName, String lastName, String tC, int birthYear,
			String email, String password) {
		super();
		this.id = id;
		this.staffs_id = staffs_id;
		this.firstName = firstName;
		this.lastName = lastName;
		TC = tC;
		this.birthYear = birthYear;
		this.email = email;
		this.password = password;
	}

	SessionFactory factory = new Configuration()
		    .configure("com\\hibernatedemo\\hibernate.cfg.xml")
		    .addAnnotatedClass(CorporateCustomer.class).buildSessionFactory();
 			
	Session session = factory.getCurrentSession();


	@Override
	public void add(Employee entity) {
		try {
			session.beginTransaction();
			entity.setStaffs_id(staffs_id);
			entity.setFirstName(firstName);
			entity.setLastName(lastName);
			entity.setEmail(email);
			entity.setPassword(password);
			entity.setTC(TC);
			entity.setBirthYear(birthYear);
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Banka çalýþaný eklendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void update(Employee entity) {
		try {
			session.beginTransaction();
			entity.setFirstName(firstName);
			entity.setLastName(lastName);
			entity.setEmail(email);
			entity.setPassword(password);
			entity.setTC(TC);
			entity.setBirthYear(birthYear);
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("Banka çalýþaný güncellendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(Employee entity) {
		try {
			entity = session.get(entity.getClass(), id);
			session.delete(entity);
		}finally {
			factory.close();
		}
	}

	@Override
	public void signIn(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(Employee entity) {
		// TODO Auto-generated method stub
		
	}




}

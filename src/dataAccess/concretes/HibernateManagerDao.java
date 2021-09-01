package dataAccess.concretes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dataAccess.abstracts.StaffDao;
import entities.concretes.subClasses.CorporateCustomer;
import entities.concretes.subClasses.Manager;

public class HibernateManagerDao implements StaffDao<Manager>{
	
	private int id;
	private int staffs_id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String TC;
	private int birthYear;


	
	public HibernateManagerDao(int id, int staffs_id, String firstName, String lastName, String email, String password,String tC, int birthYear) {
		this.id = id;
		this.staffs_id = staffs_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		TC = tC;
		this.birthYear = birthYear;
	}

	SessionFactory factory = new Configuration()
		    .configure("com\\hibernatedemo\\hibernate.cfg.xml")
		    .addAnnotatedClass(CorporateCustomer.class).buildSessionFactory();
 			
	Session session = factory.getCurrentSession();

	@Override
	public void add(Manager entity) {
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
			System.out.println("Bankanýn müdürü eklendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void update(Manager entity) {
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
			System.out.println("Bankanýn müdürü güncellendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(Manager entity) {
		try {
			entity = session.get(entity.getClass(), id);
			session.delete(entity);
		}finally {
			factory.close();
		}
	}

	@Override
	public void signIn(Manager entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(Manager entity) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

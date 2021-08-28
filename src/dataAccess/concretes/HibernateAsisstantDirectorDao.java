package dataAccess.concretes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dataAccess.abstracts.StaffDao;
import entities.concretes.subClasses.AsisstansDirector;
import entities.concretes.subClasses.CorporateCustomer;

public class HibernateAsisstantDirectorDao implements StaffDao<AsisstansDirector>{

	private int id;
	private int staffs_id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String TC;
	private int birthYear;
	

	
	public HibernateAsisstantDirectorDao(int id, int staffs_id, String firstName, String lastName, String email,
			String password, String tC, int birthYear) {
		super();
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
	public void add(AsisstansDirector entity) {
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
			System.out.println("Bankanýn müdür yardýmcýsý eklendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void update(AsisstansDirector entity) {
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
			System.out.println("Bankanýn müdür yardýmcýsý güncellendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(AsisstansDirector entity) {
		try {
			entity = session.get(entity.getClass(), id);
			session.delete(entity);
		}finally {
			factory.close();
		}
	}

	@Override
	public void signIn(AsisstansDirector entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(AsisstansDirector entity) {
		// TODO Auto-generated method stub
		
	}
	




}

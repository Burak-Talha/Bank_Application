package dataAccess.concretes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.subClasses.CorporateCustomer;
import entities.concretes.subClasses.IndividualCustomer;

public class HibernateIndividualCustomerDao implements CustomerDao<IndividualCustomer> {
	private int id;
	private int customerId;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String TC;
	private int birthYear;
	
	
	public HibernateIndividualCustomerDao(int id, int customerId, String userName, String firstName, String lastName,String email, String password, String tC, int birthYear) {
		this.id = id;
		this.customerId = customerId;
		this.userName = userName;
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
	public void add(IndividualCustomer entity) {
		try {
		session.beginTransaction();
		entity.setCustomersId(customerId);
		entity.setUserName(userName);
		entity.setFirstName(firstName);
		entity.setLastName(lastName);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setTC(TC);
		entity.setBirthYear(birthYear);
		session.save(entity);
		session.getTransaction().commit();
		System.out.println("Tüzel müþterisi eklendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void update(IndividualCustomer entity) {
		try {
		session.beginTransaction();
		entity.setCustomersId(customerId);
		entity.setUserName(userName);
		entity.setFirstName(firstName);
		entity.setLastName(lastName);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setTC(TC);
		entity.setBirthYear(birthYear);
		session.save(entity);
		session.getTransaction().commit();
		System.out.println("Tüzel müþterisi güncellendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(IndividualCustomer entity) {
		try {
			entity = session.get(entity.getClass(), id);
			session.delete(entity);
		}finally {
			factory.close();
		}
	}

	@Override
	public void signIn(IndividualCustomer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(IndividualCustomer entity) {
		// TODO Auto-generated method stub
		
	}







}

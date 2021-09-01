package dataAccess.concretes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.subClasses.CorporateCustomer;

public class HibernateCorporateCustomerDao implements CustomerDao<CorporateCustomer>  {
	private int id;
	private int customersId;
	private String corporateName;
	private String email;
	private String password;
	private String taxNumber;
	

	public HibernateCorporateCustomerDao(int id, int customersId, String corporateName, String email, String password,
			String taxNumber) {
		super();
		this.id = id;
		this.customersId = customersId;
		this.corporateName = corporateName;
		this.email = email;
		this.password = password;
		this.taxNumber = taxNumber;
	}

	SessionFactory factory = new Configuration()
			    .configure("com\\hibernatedemo\\hibernate.cfg.xml")
			    .addAnnotatedClass(CorporateCustomer.class).buildSessionFactory();
	 			
	 Session session = factory.getCurrentSession();
	 			
	@Override
	public void add(CorporateCustomer entity) {
		try {
		session.beginTransaction();
		entity.setCorporateName(corporateName);
		entity.setCustomersId(customersId);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setTaxNumber(taxNumber);
		session.save(entity);
		session.getTransaction().commit();
		System.out.println("�irket m��terisi eklendi");
		}finally {
			factory.close();
		}
	}

	@Override
	public void update(CorporateCustomer entity) {
		try {
		entity = session.get(entity.getClass(), id);
		entity.setCorporateName(corporateName);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setTaxNumber(taxNumber);
		session.save(entity);
		session.getTransaction().commit();
		System.out.println("�irket m��terisi g�ncellendi");
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(CorporateCustomer entity) {
		try {
			entity = session.get(entity.getClass(), id);
			session.delete(entity);
		}finally {
			factory.close();
		}
	}

	@Override
	public void signIn(CorporateCustomer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logIn(CorporateCustomer entity) {
		// TODO Auto-generated method stub
		
	}



	
}

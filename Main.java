import business.abstracts.CustomerService;
import business.concretes.HibernateCustomerManager;
import dataAccess.concretes.HibernateCorporateCustomerDao;
import entities.concretes.subClasses.CorporateCustomer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new HibernateCustomerManager(new HibernateCorporateCustomerDao(new CorporateCustomer()));

		
		
	}

}

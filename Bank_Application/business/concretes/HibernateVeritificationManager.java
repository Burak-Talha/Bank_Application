package business.concretes;

import business.abstracts.VeritificationService;
import dataAccess.abstracts.VeritificationDao;

public class HibernateVeritificationManager implements VeritificationService {
	
	private VeritificationDao veritificationDao;

	public HibernateVeritificationManager(VeritificationDao veritificationDao) {
		this.veritificationDao = veritificationDao;
	}

	public void regexVeritification() {
		// TODO Auto-generated method stub
		
	}

	public void mernisVeritification() {
		// TODO Auto-generated method stub
		
	}

}
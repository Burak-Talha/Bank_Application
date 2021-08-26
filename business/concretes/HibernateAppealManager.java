package business.concretes;

import business.abstracts.AppealService;
import dataAccess.abstracts.AppealDao;

public class HibernateAppealManager implements AppealService {
	
	private AppealDao appealDao;

	public HibernateAppealManager(AppealDao appealDao) {
		this.appealDao = appealDao;
	}

	public void appeal() {
		// TODO Auto-generated method stub
		
	}
	
}

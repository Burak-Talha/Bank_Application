package business.concretes;

import business.abstracts.AppealService;
import dataAccess.abstracts.AppealDao;
import dataAccess.concretes.superClasses.HibernateAppealDao;

public class AppealManager implements AppealService {
	
	private AppealDao appealDao;

	public AppealManager(AppealDao appealDao) {
		this.appealDao = appealDao;
	}

	public void appeal() {
		appealDao.appeal();
	}
	
}

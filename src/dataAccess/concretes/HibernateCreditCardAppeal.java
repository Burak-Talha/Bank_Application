package dataAccess.concretes;

import core.appeal.concretes.CreditCardAppeal;
import dataAccess.abstracts.AppealDao;

public class HibernateCreditCardAppeal implements AppealDao {

	private CreditCardAppeal creditCardAppeal;
	
	public HibernateCreditCardAppeal(CreditCardAppeal creditCardAppeal) {
		this.creditCardAppeal = creditCardAppeal;
	}

	public void appeal(int appealId, int customersId, int customersTypeId, String situation) {
		creditCardAppeal.setAppealId(appealId);
		creditCardAppeal.setCustomersId(customersId);
		creditCardAppeal.setCustomersTypeId(customersTypeId);
		creditCardAppeal.setSituation(situation);
	}

}

package dataAccess.concretes;

import core.appeal.concretes.CreditCardAppeal;
import dataAccess.abstracts.AppealDao;

public class HibernateCreditCardAppeal implements AppealDao {

	private CreditCardAppeal creditCardAppeal;
	
	public HibernateCreditCardAppeal(CreditCardAppeal creditCardAppeal) {
		this.creditCardAppeal = creditCardAppeal;
	}

	public void appeal() {
		// TODO Auto-generated method stub
		
	}

}

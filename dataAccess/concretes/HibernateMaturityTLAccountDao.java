package dataAccess.concretes;

import core.account.concretes.MaturityTLAccount;
import dataAccess.abstracts.AccountsDao;

public class HibernateMaturityTLAccountDao implements AccountsDao {
	
	private MaturityTLAccount maturityTLAccount;

	public HibernateMaturityTLAccountDao(MaturityTLAccount maturityTLAccount) {
		this.maturityTLAccount = maturityTLAccount;
	}

	public void withDrawMoney() {
		// TODO Auto-generated method stub
		
	}

	public void eftMoney() {
		// TODO Auto-generated method stub
		
	}

	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}



}

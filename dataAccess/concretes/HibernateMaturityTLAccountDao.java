package dataAccess.concretes;

import core.account.concretes.MaturityTLAccount;
import dataAccess.abstracts.AccountDao;

public class HibernateMaturityTLAccountDao implements AccountDao {
	
	private MaturityTLAccount maturityTLAccount;

	public HibernateMaturityTLAccountDao(MaturityTLAccount maturityTLAccount) {
		this.maturityTLAccount = maturityTLAccount;
	}

	public void depositmoney() {
		// TODO Auto-generated method stub
		
	}

	public void withDrawMoney() {
		// TODO Auto-generated method stub
		
	}

	public void eftMoney() {
		// TODO Auto-generated method stub
		
	}



}

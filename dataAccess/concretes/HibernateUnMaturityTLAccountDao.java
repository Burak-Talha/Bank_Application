package dataAccess.concretes;

import core.account.concretes.UnMaturityTLAccount;
import dataAccess.abstracts.AccountDao;

public class HibernateUnMaturityTLAccountDao implements AccountDao{
	
	private UnMaturityTLAccount unMaturityTLAccount;

	public HibernateUnMaturityTLAccountDao(UnMaturityTLAccount unMaturityTLAccount) {
		this.unMaturityTLAccount = unMaturityTLAccount;
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

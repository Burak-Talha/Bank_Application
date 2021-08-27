package dataAccess.concretes;

import core.account.concretes.UnMaturityTLAccount;
import dataAccess.abstracts.AccountsDao;

public class HibernateUnMaturityTLAccountDao implements AccountsDao{
	
	private UnMaturityTLAccount unMaturityTLAccount;

	public HibernateUnMaturityTLAccountDao(UnMaturityTLAccount unMaturityTLAccount) {
		this.unMaturityTLAccount = unMaturityTLAccount;
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

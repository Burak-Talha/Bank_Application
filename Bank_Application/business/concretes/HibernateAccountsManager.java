package business.concretes;


import business.abstracts.AccountsService;
import dataAccess.abstracts.AccountDao;



public class HibernateAccountsManager implements AccountsService {
	private AccountDao account;

	public HibernateAccountsManager(AccountDao account) {
		this.account = account;
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

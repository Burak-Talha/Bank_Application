package business.concretes;


import business.abstracts.AccountsService;


import dataAccess.abstracts.AccountsDao;



public class HibernateAccountsManager implements AccountsService {
	private AccountsDao account;

	public HibernateAccountsManager(AccountsDao account) {
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

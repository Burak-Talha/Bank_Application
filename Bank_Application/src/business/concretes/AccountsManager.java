package business.concretes;


import business.abstracts.AccountsService;


import dataAccess.abstracts.AccountsDao;



public class AccountsManager implements AccountsService {
	private AccountsDao account;

	public AccountsManager(AccountsDao account) {
		this.account = account;
	}

	
	public void depositmoney() {
		account.depositMoney();
	}

	public void withDrawMoney() {
		account.withDrawMoney();
	}

	public void eftMoney() {
		account.eftMoney();
	}




}

package api.controller;

import business.abstracts.AccountsService;

public class AccountsController {
    
    private AccountsService accountsService;

    public AccountsController(AccountsService accountsService){
        this.accountsService = accountsService;
    }

    public void depositMoney(){
        accountsService.depositmoney();
    }

    public void withdrawMoney(){
        accountsService.withDrawMoney();
    }

    public void eftMoney(){
        accountsService.eftMoney();
    }


}

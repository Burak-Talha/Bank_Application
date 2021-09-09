package core.account.concretes;

import core.account.abstracts.Account;

public class MaturityTLAccount implements Account {
private int accountId;
private int customersTypeId;
private int cardTypeId;
private int cardId;
private int id;
private String accountName;
private double balance;

public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public int getCustomersTypeId() {
	return customersTypeId;
}
public void setCustomersTypeId(int customersTypeId) {
	this.customersTypeId = customersTypeId;
}
public int getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(int cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public int getCardId() {
	return cardId;
}
public void setCardId(int cardId) {
	this.cardId = cardId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

}

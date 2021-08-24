package entities.concretes.subClasses;

import entities.abstracts.Card;

public class creditCard implements Card{
private int cardTypeId;
private int id;
private int accounTypeId;
private int accountId;
private String creditCardName;

public int getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(int cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAccounTypeId() {
	return accounTypeId;
}
public void setAccounTypeId(int accounTypeId) {
	this.accounTypeId = accounTypeId;
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getCreditCardName() {
	return creditCardName;
}
public void setCreditCardName(String creditCardName) {
	this.creditCardName = creditCardName;
}
}

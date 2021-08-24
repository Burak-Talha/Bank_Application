package core.card.concretes;

import core.card.abstracts.Card;

public class moneyCard implements Card {
	private int cardTypeId;
	private int id;
	private int accounTypeId;
	private int accountId;
	private String moneyCardName;
	
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
	public String getMoneyCardName() {
		return moneyCardName;
	}
	public void setMoneyCardName(String moneyCardName) {
		this.moneyCardName = moneyCardName;
	}
}

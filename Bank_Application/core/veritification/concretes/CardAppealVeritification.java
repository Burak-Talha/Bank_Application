package core.veritification.concretes;

import core.veritification.abstracts.Veritification;

public class CardAppealVeritification implements Veritification {
private int cardTypeId;
private int appealId;
private int veritificationId;
private boolean staffValid;

public int getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(int cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public int getAppealId() {
	return appealId;
}
public void setAppealId(int appealId) {
	this.appealId = appealId;
}
public int getVeritificationId() {
	return veritificationId;
}
public void setVeritificationId(int veritificationId) {
	this.veritificationId = veritificationId;
}
public boolean isStaffValid() {
	return staffValid;
}
public void setStaffValid(boolean staffValid) {
	this.staffValid = staffValid;
}
}

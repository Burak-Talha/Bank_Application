package core.card.concretes;

public class Card {
private int cardTypeId;
private int id;
private boolean isInstallment;

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
public boolean isInstallment() {
	return isInstallment;
}
public void setInstallment(boolean isInstallment) {
	this.isInstallment = isInstallment;
}
}

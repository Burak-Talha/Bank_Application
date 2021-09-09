package core.appeal.concretes;

public class MoneyCardAppeal {
	private int appealId;
	private int customersTypeId;
	private int customersId;
	private String situation;

	public int getAppealId() {
		return appealId;
	}
	public void setAppealId(int appealId) {
		this.appealId = appealId;
	}
	public int getCustomersTypeId() {
		return customersTypeId;
	}
	public void setCustomersTypeId(int customersTypeId) {
		this.customersTypeId = customersTypeId;
	}
	public int getCustomersId() {
		return customersId;
	}
	public void setCustomersId(int customersId) {
		this.customersId = customersId;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
}

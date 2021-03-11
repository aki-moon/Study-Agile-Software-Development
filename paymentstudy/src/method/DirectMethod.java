package agilesoftwaredevelopment.paymentstudy.src.method;

public class DirectMethod implements PaymentMethod {
	private String bank;
	private int amount;

	public String bank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int amount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

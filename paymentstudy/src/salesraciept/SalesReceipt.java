package agilesoftwaredevelopment.paymentstudy.src.salesraciept;

public class SalesReceipt {

	private String date;
	private int amount;

	public SalesReceipt(String date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	public int amount() {
		return amount;
	}

	public String date() {
		return date;
	}

}

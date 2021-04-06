package agilesoftwaredevelopment.paymentstudy.src.affrication;

public class UnionAfflication implements Afflication {

	private String date;
	private double amount;

	public UnionAfflication(double amount) {
		this.amount = amount;
	}

	@Override
	public double serviceCharge() {
		return amount;
	}

	public String date() {
		return date;
	}

	public void addServiceCharge(String date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public double getDues() {
		return 0;
	}

}

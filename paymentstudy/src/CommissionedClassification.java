package agilesoftwaredevelopment.paymentstudy.src;

public class CommissionedClassification implements PaymentClassification{

	private double salary;
	private double commisonRate;

	public CommissionedClassification(double salary, double commissionRate) {
		this.salary = salary;
		this.commisonRate = commissionRate;
	}

	public double salary() {
		return salary;
	}

	public double commisionRate() {
		return commisonRate;
	}

}

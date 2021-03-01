package agilesoftwaredevelopment.paymentstudy.src;

public class SalariedClassification implements PaymentClassification{
	private double itsSalary;

	public SalariedClassification(double itsSalary) {
		this.itsSalary = itsSalary;
	}

	public double salary() {
		return itsSalary;
	}

}

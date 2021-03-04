package agilesoftwaredevelopment.paymentstudy.src.classfication;

import agilesoftwaredevelopment.paymentstudy.src.salesraciept.SalesReceipt;

public class CommissionedClassification implements PaymentClassification {

	private double salary;
	private double commisonRate;
	private SalesReceipt salesReceipt;

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

	public SalesReceipt getSalesReceipt() {
		return salesReceipt;
	}

	public void addSalesReceipt(SalesReceipt salesReceipt) {
		this.salesReceipt = salesReceipt;
	}

}

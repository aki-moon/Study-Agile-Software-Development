package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.CommissionedClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.salesraciept.SalesReceipt;

public class SalesReceiptTransaction implements Transaction {

	private String date;
	private int amount;
	private int empId;

	public SalesReceiptTransaction(String date, int amount, int empId) {
		this.date = date;
		this.amount = amount;
		this.empId = empId;
	}

	@Override
	public void execute() {
		Employee employee = PayRollDataBase.getEmployee(empId);
		if (employee != null) {
			PaymentClassification classification = employee.getClassfication();
			if (classification instanceof CommissionedClassification) {
				CommissionedClassification commissionedClassification = (CommissionedClassification) classification;
				commissionedClassification.addSalesReceipt(new SalesReceipt(date, amount));
			} else {
				throw new RuntimeException("Tried to add salesReceipt to non-commissioned employee.");
			}
		} else {
			throw new RuntimeException("No such Employee.");
		}
	}

}

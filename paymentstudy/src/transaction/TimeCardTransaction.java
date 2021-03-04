package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.timecard.TimeCard;

public class TimeCardTransaction implements Transaction {
	private String date;
	private double hours;
	private int empId;

	public TimeCardTransaction(String date, double hours, int empId) {
		this.date = date;
		this.hours = hours;
		this.empId = empId;
	}

	@Override
	public void execute() {
		Employee employee = PayRollDataBase.getEmployee(empId);
		if (employee != null) {
			PaymentClassification classification = employee.getClassfication();
			if (classification instanceof HourlyClassification) {
				HourlyClassification hourlyClassification = (HourlyClassification) classification;
				hourlyClassification.addTimeCard(new TimeCard(date, hours));
			} else {
				throw new RuntimeException("Tried to add timeCard to non-hourly employee.");
			}
		} else {
			throw new RuntimeException("No such Employee.");
		}
	}

}

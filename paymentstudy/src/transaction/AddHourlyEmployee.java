package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.WeeklySchedule;

public class AddHourlyEmployee extends AddEmployeeTransaction {
	private double hourlyRate;

	public AddHourlyEmployee(int empId, String name, String address, double hourlyRate) {
		super(empId, name, address);
		this.hourlyRate = hourlyRate;
	}

	@Override
	protected PaymentSchedule getScheduled() {
		return new WeeklySchedule();
	}

	@Override
	protected PaymentClassification getClassfication() {
		return new HourlyClassification(hourlyRate);
	}

}

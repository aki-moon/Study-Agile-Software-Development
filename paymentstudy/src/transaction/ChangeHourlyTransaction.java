package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.WeeklySchedule;

public class ChangeHourlyTransaction extends ChangeClassficationTransaction {

	private double rate;

	public ChangeHourlyTransaction(int empId, double rate) {
		super(empId);
		this.rate = rate;
	}

	@Override
	PaymentSchedule getSchedule() {
		return new WeeklySchedule();
	}

	@Override
	PaymentClassification getClassfication() {
		return new HourlyClassification(rate);
	}

}

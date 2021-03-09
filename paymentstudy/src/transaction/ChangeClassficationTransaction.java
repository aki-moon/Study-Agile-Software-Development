package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;

public abstract class ChangeClassficationTransaction extends ChangeEmployeeTransaction {

	public ChangeClassficationTransaction(int empId) {
		super(empId);
	}

	@Override
	void change(Employee employee) {
		employee.setSchedule(getSchedule());
		employee.setClassfication(getClassfication());
	}

	abstract PaymentSchedule getSchedule();

	abstract PaymentClassification getClassfication();

}

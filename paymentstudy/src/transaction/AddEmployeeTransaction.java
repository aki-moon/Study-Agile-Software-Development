package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;

public abstract class AddEmployeeTransaction implements Transaction {
	private int itsEmpId;
	private String itsName;
	private String itsAddress;

	public AddEmployeeTransaction(int itsEmpId, String itsName, String itsAddress) {
		super();
		this.itsEmpId = itsEmpId;
		this.itsName = itsName;
		this.itsAddress = itsAddress;
	}

	@Override
	public void execute() {
		PaymentClassification classification = getClassfication();
		PaymentSchedule paymentSchedule = getScheduled();
		PaymentMethod method = new HoldMethod();
		Employee employee = new Employee(itsEmpId, itsName, itsAddress);
		employee.setClassfication(classification);
		employee.setSchedule(paymentSchedule);
		employee.setMethod(method);
		PayRollDataBase.addEmployee(itsEmpId, employee);
	}

	protected abstract PaymentSchedule getScheduled();

	protected abstract PaymentClassification getClassfication();
}

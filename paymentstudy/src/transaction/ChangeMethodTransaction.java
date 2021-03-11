package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;

public class ChangeMethodTransaction extends ChangeEmployeeTransaction {

	private PaymentMethod paymentMethod;

	public ChangeMethodTransaction(int empId, PaymentMethod paymentMethod) {
		super(empId);
		this.paymentMethod = paymentMethod;
	}

	@Override
	void change(Employee employee) {
		employee.setMethod(paymentMethod);
	}

}

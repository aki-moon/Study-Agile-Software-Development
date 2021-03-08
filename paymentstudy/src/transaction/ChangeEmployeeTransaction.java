package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public abstract class ChangeEmployeeTransaction implements Transaction {
	private int empId;

	public ChangeEmployeeTransaction(int empId) {
		super();
		this.empId = empId;
	}

	@Override
	public void execute() {
		Employee employee = PayRollDataBase.getEmployee(empId);
		if (employee != null) {
			change(employee);
		}
	}

	abstract void change(Employee employee);

}

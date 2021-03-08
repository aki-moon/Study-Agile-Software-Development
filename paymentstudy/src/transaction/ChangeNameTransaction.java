package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class ChangeNameTransaction extends ChangeEmployeeTransaction {
	private String name;

	public ChangeNameTransaction(int empId, String name) {
		super(empId);
		this.name = name;
	}

	@Override
	void change(Employee employee) {
		employee.setName(name);
	}

}

package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class ChangeAddressTransaction extends ChangeEmployeeTransaction {
	private String address;

	public ChangeAddressTransaction(int empId, String address) {
		super(empId);
		this.address = address;
	}

	@Override
	void change(Employee employee) {
		employee.setAddress(address);
	}

}

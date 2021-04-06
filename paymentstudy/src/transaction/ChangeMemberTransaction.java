package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class ChangeMemberTransaction extends ChangeEmployeeTransaction {

	public ChangeMemberTransaction(int empId, int memberId, double d) {
		super(empId);
	}

	@Override
	void change(Employee employee) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

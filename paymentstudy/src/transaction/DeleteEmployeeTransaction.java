package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;

public class DeleteEmployeeTransaction implements Transaction {
	private int itsEmpId;

	public DeleteEmployeeTransaction(int itsEmpId) {
		super();
		this.itsEmpId = itsEmpId;
	}

	@Override
	public void execute() {
		PayRollDataBase.deleteEmployee(itsEmpId);
	}

}

package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class ChangeAffricationTransaction extends ChangeEmployeeTransaction {

	private Afflication affrication;

	public ChangeAffricationTransaction(int empId, Afflication Affrication) {
		super(empId);
		this.affrication = Affrication;
	}

	@Override
	void change(Employee employee) {
		employee.setAfflication(affrication);
	}

}

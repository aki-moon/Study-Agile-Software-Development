package agilesoftwaredevelopment.paymentstudy.src.transaction;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;
import agilesoftwaredevelopment.paymentstudy.src.affrication.UnionAfflication;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class ServiceChargeTransaction implements Transaction {

	private int memberId;
	private String date;
	private double amount;

	public ServiceChargeTransaction(int memberId, String date, double amount) {
		this.memberId = memberId;
		this.date = date;
		this.amount = amount;
	}

	@Override
	public void execute() {
		Employee employee = PayRollDataBase.getEmployee(memberId);
		Afflication afflication = employee.afflication();
		if(afflication instanceof UnionAfflication) {
			UnionAfflication unionAfflication = (UnionAfflication) afflication;
			unionAfflication.addServiceCharge(date, amount);
		}

	}

}

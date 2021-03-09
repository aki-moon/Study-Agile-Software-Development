package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddCommissionedEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeHourlyTransaction;

class ChangeHourlyTransactionTest {

	@Test
	void changeHourlyTransactionTest() {
		System.err.println("changeHourlyTransactionTest");
		int empId = 3;
		AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(empId, "Lance", "Home", 2500,
				3.2);
		addCommissionedEmployee.execute();
		ChangeHourlyTransaction changeHourlyTransaction = new ChangeHourlyTransaction(empId, 27.52);
		changeHourlyTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
	}

}

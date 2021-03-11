package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.NoAffrication;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeAffricationTransaction;

class ChangeAffricationTransactionTest {

	@Test
	void changeAffricationTransactionTest() {
		System.err.println("changeAffricationTransaction");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(2, "Bill", "Japan", 15.25);
		addHourlyEmployee.execute();
		ChangeAffricationTransaction changeAddressTransaction = new ChangeAffricationTransaction(empId, new NoAffrication());
		changeAddressTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertTrue(employee.afflication() instanceof NoAffrication);
	}

}

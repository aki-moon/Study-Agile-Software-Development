package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeNameTransaction;

class ChangeNameTransactionTest {

	@Test
	void changeNameTransactionTest() {
		System.err.println("changeNameTransactionTest");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(2, "Bill", "Home", 15.25);
		addHourlyEmployee.execute();
		ChangeNameTransaction changeNameTransaction = new ChangeNameTransaction(empId, "Bob");
		changeNameTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertEquals("Bob", employee.name());
	}

}

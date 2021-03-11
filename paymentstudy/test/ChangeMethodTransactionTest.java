package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.MailMethod;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeMethodTransaction;

class ChangeMethodTransactionTest {

	@Test
	void changeMethodTransactionTest() {
		System.err.println("changeMethodTransactionTest");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(2, "Bill", "Japan", 15.25);
		addHourlyEmployee.execute();
		ChangeMethodTransaction changeMethodTransaction = new ChangeMethodTransaction(empId, new MailMethod());
		changeMethodTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertTrue(employee.method() instanceof MailMethod);
	}

}

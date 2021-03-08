package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeAddressTransaction;

class ChangeAddressTransactionTest {

	@Test
	void changeAddressTransactionTest() {
		System.err.println("changeAddressTransactionTest");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(2, "Bill", "Japan", 15.25);
		addHourlyEmployee.execute();
		ChangeAddressTransaction changeAddressTransaction = new ChangeAddressTransaction(empId, "US");
		changeAddressTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertEquals("US", employee.address());
	}

}

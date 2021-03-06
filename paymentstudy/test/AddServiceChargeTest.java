package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;
import agilesoftwaredevelopment.paymentstudy.src.affrication.UnionAfflication;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ServiceChargeTransaction;
import agilesoftwaredevelopment.paymentstudy.src.transaction.TimeCardTransaction;

class AddServiceChargeTest {

	@Test
	void addServiceChargeTest() {
		System.err.println("addServiceChargeTest");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(empId, "Bill", "Home", 15.25);
		addHourlyEmployee.execute();
		TimeCardTransaction timeCardTransaction = new TimeCardTransaction("20210306", 8.0, empId);
		timeCardTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		Afflication afflication = new UnionAfflication(12.5);
		employee.setAfflication(afflication);
		int memberId = 86;
		PayRollDataBase.addUnionMember(memberId, employee);
		ServiceChargeTransaction serviceChargeTransaction = new ServiceChargeTransaction(memberId, "20210306", 12.95);
		serviceChargeTransaction.execute();
		double serviceCharge = afflication.serviceCharge();
		assertTrue(serviceCharge == 12.95);
	}

}

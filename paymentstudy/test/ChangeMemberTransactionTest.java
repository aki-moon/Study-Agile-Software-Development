package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;
import agilesoftwaredevelopment.paymentstudy.src.affrication.UnionAfflication;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeMemberTransaction;

class ChangeMemberTransactionTest {

	@Test
	void changeMemberTransactionTest() {
		System.err.println("ChangeMemberTransactionTest");
		int empId = 2;
		int memberId = 7734;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(empId, "Bill", "Home", 15.25);
		addHourlyEmployee.execute();
		ChangeMemberTransaction changeMemberTransaction = new ChangeMemberTransaction(empId, memberId, 99.42);
		changeMemberTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		Afflication afflication = employee.afflication();
		assertNotNull(afflication);
		UnionAfflication unionAfflication = (UnionAfflication) afflication;
		assertNotNull(unionAfflication);
		assertEquals(99.42, unionAfflication.getDues());
		Employee member = PayRollDataBase.getUnionMember();
		assertNotNull(member);
		assertEquals(employee, member);
	}

}

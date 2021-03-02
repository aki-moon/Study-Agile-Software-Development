package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.AddCommissionedEmployee;
import agilesoftwaredevelopment.paymentstudy.src.DeleteEmployeeTransaction;
import agilesoftwaredevelopment.paymentstudy.src.Employee;
import agilesoftwaredevelopment.paymentstudy.src.PayRollDataBase;

class DeleteEmployeeTest {

	@Test
	void testDeleteEmployee() {
		System.err.println("testDeleteEmployee");
		int empId = 3;
		AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(empId, "Lance", "Home", 2500,
				3.2);
		addCommissionedEmployee.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		DeleteEmployeeTransaction deleteEmployeeTransaction = new DeleteEmployeeTransaction(empId);
		deleteEmployeeTransaction.execute();
		employee = PayRollDataBase.getEmployee(empId);
		assertNull(employee);
	}

}

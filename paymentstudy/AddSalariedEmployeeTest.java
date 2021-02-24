package agilesoftwaredevelopment.paymentstudy;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class AddSalariedEmployeeTest {

	@Test
	void addSalariedEmployeeTest() {
		System.err.print("AddSalariedEmployeeTest");
		int empId = 1;
		AddSalariedEmployee addSalariedEmployee = new AddSalariedEmployee(empId, "Bob", "Home", 1000.00);
		addSalariedEmployee.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(addSalariedEmployee);
		assertEquals("Bob", employee.getName());
		PaymentClassification paymentClassification = employee.getClassfication();
		SalariedClassification salariedClassification = (SalariedClassification) paymentClassification;
		assertNotNull(salariedClassification);
		assertEquals(1000.00, salariedClassification.getSalary());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		MonthlySchedule monthlySchedule = (MonthlySchedule) paymentSchedule;
		assertNotNull(monthlySchedule);
		PaymentMethod paymentMethod = employee.getMethod();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

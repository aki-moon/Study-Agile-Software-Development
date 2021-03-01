package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.AddCommissionedEmployee;
import agilesoftwaredevelopment.paymentstudy.src.BiWeeklySchedule;
import agilesoftwaredevelopment.paymentstudy.src.CommissionedClassification;
import agilesoftwaredevelopment.paymentstudy.src.Employee;
import agilesoftwaredevelopment.paymentstudy.src.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.PaymentSchedule;

class AddCommissionedEmployeeTest {

	@Test
	void addCommissionedEmployeeTest() {
		System.err.print("addCommissionedEmployeeTest");
		int empId = 1;
		AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(empId, "Bob", "Home", 1000.00, 0.01);
		addCommissionedEmployee.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertEquals("Bob", employee.name());
		PaymentClassification paymentClassification = employee.getClassfication();
		CommissionedClassification commisionedClassification = (CommissionedClassification) paymentClassification;
		assertNotNull(commisionedClassification);
		assertThat("assert salary", 1000.00 == commisionedClassification.salary());
		assertThat("assert commision rate", 0.01 == commisionedClassification.commisionRate());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		BiWeeklySchedule biWeeklySchedule = (BiWeeklySchedule) paymentSchedule;
		assertNotNull(biWeeklySchedule);
		PaymentMethod paymentMethod = employee.getMethod();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

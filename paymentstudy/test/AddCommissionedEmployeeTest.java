package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.CommissionedClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.schedule.BiWeeklySchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddCommissionedEmployee;

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
		PaymentMethod paymentMethod = employee.method();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

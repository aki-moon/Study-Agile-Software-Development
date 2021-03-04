package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.SalariedClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.schedule.MonthlySchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddSalariedEmployee;

class AddSalariedEmployeeTest {

	@Test
	void addSalariedEmployeeTest() {
		System.err.print("AddSalariedEmployeeTest");
		int empId = 1;
		AddSalariedEmployee addSalariedEmployee = new AddSalariedEmployee(empId, "Bob", "Home", 1000.00);
		addSalariedEmployee.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertEquals("Bob", employee.name());
		PaymentClassification paymentClassification = employee.getClassfication();
		SalariedClassification salariedClassification = (SalariedClassification) paymentClassification;
		assertNotNull(salariedClassification);
		assertThat("assert salary", 1000.00 == salariedClassification.salary());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		MonthlySchedule monthlySchedule = (MonthlySchedule) paymentSchedule;
		assertNotNull(monthlySchedule);
		PaymentMethod paymentMethod = employee.getMethod();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.Employee;
import agilesoftwaredevelopment.paymentstudy.src.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.WeeklySchedule;

class AddHourlyEmployeeTest {

	@Test
	void addHourlyEmployeeTest() {
		System.err.print("addHourlyEmployeeTest");
		int empId = 1;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(empId, "Bob", "Home", 1000.00);
		addHourlyEmployee.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		assertEquals("Bob", employee.name());
		PaymentClassification paymentClassification = employee.getClassfication();
		HourlyClassification hourlyClassification = (HourlyClassification) paymentClassification;
		assertNotNull(hourlyClassification);
		assertThat("assert salary", 1000.00 == hourlyClassification.hourlyRate());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		WeeklySchedule weeklySchedule = (WeeklySchedule) paymentSchedule;
		assertNotNull(weeklySchedule);
		PaymentMethod paymentMethod = employee.getMethod();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

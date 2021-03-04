package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.method.HoldMethod;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.WeeklySchedule;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;

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
		assertThat("assert hourlyRate", 1000.00 == hourlyClassification.hourlyRate());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		WeeklySchedule weeklySchedule = (WeeklySchedule) paymentSchedule;
		assertNotNull(weeklySchedule);
		PaymentMethod paymentMethod = employee.getMethod();
		HoldMethod holdMethod = (HoldMethod) paymentMethod;
		assertNotNull(holdMethod);
	}

}

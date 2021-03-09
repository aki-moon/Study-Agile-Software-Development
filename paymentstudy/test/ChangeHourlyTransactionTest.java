package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;
import agilesoftwaredevelopment.paymentstudy.src.schedule.WeeklySchedule;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddCommissionedEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.ChangeHourlyTransaction;

class ChangeHourlyTransactionTest {

	@Test
	void changeHourlyTransactionTest() {
		System.err.println("changeHourlyTransactionTest");
		int empId = 3;
		AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(empId, "Lance", "Home", 2500,
				3.2);
		addCommissionedEmployee.execute();
		ChangeHourlyTransaction changeHourlyTransaction = new ChangeHourlyTransaction(empId, 27.52);
		changeHourlyTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		PaymentClassification paymentClassification = employee.getClassfication();
		assertNotNull(paymentClassification);
		HourlyClassification hourlyClassification = (HourlyClassification) paymentClassification;
		assertNotNull(hourlyClassification);
		assertTrue(27.52 == hourlyClassification.hourlyRate());
		PaymentSchedule paymentSchedule = employee.getSchedule();
		WeeklySchedule weeklySchedule = (WeeklySchedule) paymentSchedule;
		assertNotNull(weeklySchedule);
	}

}

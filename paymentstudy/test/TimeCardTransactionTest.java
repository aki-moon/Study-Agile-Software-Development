package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.timecard.TimeCard;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.TimeCardTransaction;

class TimeCardTransactionTest {

	@Test
	void timeCardTransactionTest() {
		System.err.println("timeCardTransactionTest");
		int empId = 2;
		AddHourlyEmployee addHourlyEmployee = new AddHourlyEmployee(empId, "Bill", "Home", 15.25);
		addHourlyEmployee.execute();
		String timecardDate = "20210303";
		TimeCardTransaction timeCardTransaction = new TimeCardTransaction(timecardDate, 8.0, empId);
		timeCardTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		PaymentClassification classification = employee.getClassfication();
		HourlyClassification hourlyClassification = (HourlyClassification) classification;
		assertNotNull(hourlyClassification);
		TimeCard timeCard = hourlyClassification.timeCard();
		assertNotNull(timeCard);
		assertThat("assert hours", 8.0 == timeCard.getHours());
	}

}

package agilesoftwaredevelopment.paymentstudy.test;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.AddHourlyEmployee;
import agilesoftwaredevelopment.paymentstudy.src.Employee;
import agilesoftwaredevelopment.paymentstudy.src.HourlyClassification;
import agilesoftwaredevelopment.paymentstudy.src.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.TimeCard;
import agilesoftwaredevelopment.paymentstudy.src.TimeCardTransaction;

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
		TimeCard timeCard = hourlyClassification.getTimeCard(timecardDate);
		assertNotNull(timeCard);
		assertThat("assert hours", 1000.00 == timeCard.getHours());
	}

}

package agilesoftwaredevelopment.paymentstudy.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import agilesoftwaredevelopment.paymentstudy.src.classfication.CommissionedClassification;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.database.PayRollDataBase;
import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;
import agilesoftwaredevelopment.paymentstudy.src.salesraciept.SalesReceipt;
import agilesoftwaredevelopment.paymentstudy.src.transaction.AddCommissionedEmployee;
import agilesoftwaredevelopment.paymentstudy.src.transaction.SalesReceiptTransaction;

class SalesReceiptTransactionTest {

	@Test
	void salesReceiptTransactionTest() {
		System.err.println("salesReceiptTransactionTest");
		int empId = 3;
		AddCommissionedEmployee addCommissionedEmployee = new AddCommissionedEmployee(empId, "Aki", "Tokyo", 30, 0.1);
		addCommissionedEmployee.execute();
		String SalesReceiptDate = "20210304";
		SalesReceiptTransaction salesReceiptTransaction = new SalesReceiptTransaction(SalesReceiptDate, 100000, empId);
		salesReceiptTransaction.execute();
		Employee employee = PayRollDataBase.getEmployee(empId);
		assertNotNull(employee);
		PaymentClassification classification = employee.getClassfication();
		CommissionedClassification commisionedClassification = (CommissionedClassification) classification;
		assertNotNull(commisionedClassification);
		SalesReceipt salesReceipt = commisionedClassification.getSalesReceipt();
		assertNotNull(salesReceipt);
		assertEquals(100000, salesReceipt.amount());
	}

}

package agilesoftwaredevelopment.designpattern.nullobject;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testNull() {
		Employee employee  = DataBase.getEmployee("Bob");
		if(employee.isTimeToPay(new Date())) {
			fail();
		}
		assertEquals(Employee.NULL, employee);
	}

}

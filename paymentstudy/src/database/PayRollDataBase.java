package agilesoftwaredevelopment.paymentstudy.src.database;

import java.util.HashMap;
import java.util.Map;

import agilesoftwaredevelopment.paymentstudy.src.employee.Employee;

public class PayRollDataBase {
	private static Map<Integer, Employee> itsEmployees = new HashMap<Integer, Employee>();

	public static void addEmployee(int empId, Employee employee) {
		itsEmployees.put(empId, employee);
	}

	public static Employee getEmployee(int empId) {
		return itsEmployees.get(empId);
	}

	public static void clear() {
		itsEmployees.clear();
	}

	public static void deleteEmployee(int itsEmpId) {
		itsEmployees.remove(itsEmpId);
	}

	public static void addUnionMember(int memberId, Employee employee) {
		itsEmployees.put(memberId, employee);
	}

	public static Employee getUnionMember() {
		return null;
	}

}

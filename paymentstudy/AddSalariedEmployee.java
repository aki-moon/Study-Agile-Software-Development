package agilesoftwaredevelopment.paymentstudy;

public class AddSalariedEmployee extends AddEmployeeTransaction {
	private double itsSalary;

	public AddSalariedEmployee(int empId, String name, String address, double salary) {
		super(empId, name, address);
		itsSalary = salary;
	}

	@Override
	protected PaymentSchedule getScheduled() {
		return new MonthlySchedule(itsSalary);
	}

	@Override
	protected PaymentClassification getClassfication() {
		return new SalariedClassification();
	}

}

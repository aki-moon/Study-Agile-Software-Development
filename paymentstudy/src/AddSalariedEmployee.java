package agilesoftwaredevelopment.paymentstudy.src;

public class AddSalariedEmployee extends AddEmployeeTransaction {
	private double itsSalary;

	public AddSalariedEmployee(int empId, String name, String address, double salary) {
		super(empId, name, address);
		this.itsSalary = salary;
	}

	@Override
	protected PaymentSchedule getScheduled() {
		return new MonthlySchedule();
	}

	@Override
	protected PaymentClassification getClassfication() {
		return new SalariedClassification(itsSalary);
	}

}

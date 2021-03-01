package agilesoftwaredevelopment.paymentstudy.src;

public class AddCommissionedEmployee extends AddEmployeeTransaction  {

	private double salary;
	private double commissionRate;

	public AddCommissionedEmployee(int empId, String name, String address, double salary, double commissionRate) {
		super(empId, name, address);
		this.salary = salary;
		this.commissionRate = commissionRate;
	}

	@Override
	protected PaymentSchedule getScheduled() {
		return new BiWeeklySchedule();
	}

	@Override
	protected PaymentClassification getClassfication() {
		return new CommissionedClassification(salary, commissionRate);
	}

}

package agilesoftwaredevelopment.paymentstudy.src;

public class AddHourlyEmployee extends AddEmployeeTransaction {
	private double hourlyRate;

	public AddHourlyEmployee(int empId, String name, String address, double hourlyRate) {
		super(empId, name, address);
		this.hourlyRate = hourlyRate;
	}

	@Override
	protected PaymentSchedule getScheduled() {
		return new WeeklySchedule();
	}

	@Override
	protected PaymentClassification getClassfication() {
		return new HourlyClassification(hourlyRate);
	}

}

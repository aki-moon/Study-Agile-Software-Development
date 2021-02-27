package agilesoftwaredevelopment.paymentstudy.src;

public class Employee {
	private int itsEmpId;
	private String itsName;
	private String itsAddress;
	private PaymentClassification classification;
	private PaymentSchedule schedule;
	private PaymentMethod method;

	public Employee(int itsEmpId, String itsName, String itsAddress) {
		this.itsEmpId = itsEmpId;
		this.itsName = itsName;
		this.itsAddress = itsAddress;
	}

	public int empId() {
		return itsEmpId;
	}

	public String name() {
		return itsName;
	}

	public String address() {
		return itsAddress;
	}

	public PaymentClassification getClassfication() {
		return classification;
	}

	public PaymentSchedule getSchedule() {
		return schedule;
	}

	public PaymentMethod getMethod() {
		return method;
	}

	public void setClassfication(PaymentClassification classification) {
		this.classification = classification;
	}

	public void setSchedule(PaymentSchedule paymentSchedule) {
		this.schedule = paymentSchedule;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}

}

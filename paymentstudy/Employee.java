package agilesoftwaredevelopment.paymentstudy;

public class Employee {
	private int itsEmpId;
	private String itsName;
	private String itsAddress;

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
		return null;
	}

	public PaymentSchedule getSchedule() {
		return null;
	}

	public PaymentMethod getMethod() {
		return null;
	}

	public void setClassfication(PaymentClassification classification) {
	}

	public void setSchedule(PaymentSchedule paymentSchedule) {
	}

	public void setMethod(PaymentMethod method) {
	}

}

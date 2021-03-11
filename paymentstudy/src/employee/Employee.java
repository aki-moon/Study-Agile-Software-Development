package agilesoftwaredevelopment.paymentstudy.src.employee;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;
import agilesoftwaredevelopment.paymentstudy.src.classfication.PaymentClassification;
import agilesoftwaredevelopment.paymentstudy.src.method.PaymentMethod;
import agilesoftwaredevelopment.paymentstudy.src.schedule.PaymentSchedule;

public class Employee {
	private int itsEmpId;
	private String itsName;
	private String itsAddress;
	private PaymentClassification classification;
	private PaymentSchedule schedule;
	private PaymentMethod method;
	private Afflication afflication;

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

	public PaymentMethod method() {
		return method;
	}

	public Afflication getAfflication() {
		return afflication;
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

	public void setAfflication(Afflication afflication) {
		this.afflication = afflication;
	}

	public void setName(String name) {
		this.itsName = name;
	}

	public void setAddress(String address) {
		this.itsAddress = address;
	}

}

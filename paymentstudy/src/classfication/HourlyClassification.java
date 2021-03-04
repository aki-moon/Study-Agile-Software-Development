package agilesoftwaredevelopment.paymentstudy.src.classfication;

import agilesoftwaredevelopment.paymentstudy.src.timecard.TimeCard;

public class HourlyClassification implements PaymentClassification {

	private double hourlyRate;
	private TimeCard card;

	public HourlyClassification(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double hourlyRate() {
		return hourlyRate;
	}

	public TimeCard timeCard() {
		return card;
	}

	public void addTimeCard(TimeCard card) {
		this.card = card;
	}

}

package agilesoftwaredevelopment.paymentstudy.src;

public class HourlyClassification implements PaymentClassification{

	private double hourlyRate;
	private TimeCard card;

	public HourlyClassification(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double hourlyRate() {
		return hourlyRate;
	}

	public TimeCard getTimeCard(String timecardDate) {
		return card;
	}

	public void addTimeCard(TimeCard card) {
		this.card = card;
	}

}

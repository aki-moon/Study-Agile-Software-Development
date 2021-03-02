package agilesoftwaredevelopment.paymentstudy.src;

public class HourlyClassification implements PaymentClassification{

	private double hourlyRate;

	public HourlyClassification(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double hourlyRate() {
		return hourlyRate;
	}

	public TimeCard getTimeCard(String timecardDate) {
		return null;
	}

}

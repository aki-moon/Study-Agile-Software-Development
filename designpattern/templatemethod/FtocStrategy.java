package agilesoftwaredevelopment.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtocStrategy implements Application {
	private InputStreamReader inputStreamReader;
	private BufferedReader bufferedReader;
	private boolean isDone = false;

	public static void main(String[] args) {
		new ApplicationRunner(new FtocStrategy()).run();
	}

	@Override
	public void init() {
		inputStreamReader = new InputStreamReader(System.in);
		bufferedReader = new BufferedReader(inputStreamReader);
	}

	@Override
	public void idle() {
		String fahrString = readLineAndReturnNullIfError();
		if (fahrString == null || fahrString.length() == 0) {
			isDone = true;
		} else {
			double fahr = Double.parseDouble(fahrString);
			double celsius = 5.0 / 9.0 * (fahr - 32);
			System.out.println("F=" + fahr + ", C=" + celsius);
		}
	}

	private String readLineAndReturnNullIfError() {
		String string;
		try {
			string = bufferedReader.readLine();
		} catch (IOException e) {
			string = null;
		}
		return string;
	}

	@Override
	public boolean done() {
		return isDone;
	}

	@Override
	public void cleanup() {
		System.out.println("ftoc exit");
	}

}

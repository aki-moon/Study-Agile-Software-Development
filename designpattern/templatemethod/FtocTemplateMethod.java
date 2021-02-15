package agilesoftwaredevelopment.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtocTemplateMethod extends Application {
	private InputStreamReader inputStreamReader;
	private BufferedReader bufferedReader;

	public static void main(String[] args) throws Exception {
		new FtocTemplateMethod().run();
	}

	@Override
	protected void init() {
		inputStreamReader = new InputStreamReader(System.in);
		bufferedReader = new BufferedReader(inputStreamReader);
	}

	@Override
	protected void idle() {
		String fahrString = readLineAndReturnNullIfError();
		if (fahrString == null || fahrString.length() == 0) {
			setDone();
		} else {
			double fahr = Double.parseDouble(fahrString);
			double celsius = 5.0 / 9.0 * (fahr - 32);
			System.out.println("F=" + fahr + ", C=" + celsius);
		}
	}

	@Override
	protected void cleanup() {
		System.out.println("ftoc exit");
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

}

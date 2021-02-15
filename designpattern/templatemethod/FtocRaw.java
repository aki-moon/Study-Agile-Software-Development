package agilesoftwaredevelopment.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FtocRaw {
	public static void main(String[] args) throws Exception {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		boolean done = false;
		while(!done) {
			String fahrString = bufferedReader.readLine();
			if(fahrString == null || fahrString .length() == 0) {
				done = false;
			} else {
				double fahr = Double.parseDouble(fahrString);
				double celsius = 5.0/9.0*(fahr-32);
				System.out.println("F=" + fahr + ", C=" + celsius);
			}
		}
		System.out.println("ftoc exit");
	}
}

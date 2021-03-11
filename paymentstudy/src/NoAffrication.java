package agilesoftwaredevelopment.paymentstudy.src;

import agilesoftwaredevelopment.paymentstudy.src.affrication.Afflication;

public class NoAffrication implements Afflication{

	@Override
	public double serviceCharge() {
		return 0;
	}

}

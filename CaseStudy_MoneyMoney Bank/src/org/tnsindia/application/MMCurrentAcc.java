package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	// Constructor
	public MMCurrentAcc(int AccNo, String AccNm, float charges, float deliveryCharges) 
	{
		super(AccNo, AccNm, charges, deliveryCharges);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}
}
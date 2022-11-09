package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{
	// Constructor
	public MMCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) 
	{
		super(AccNo, AccNm, AccBal, creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc []";
	}
}
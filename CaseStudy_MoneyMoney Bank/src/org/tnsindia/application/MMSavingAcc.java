package org.tnsindia.application;

import org.tnsindia.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	// Constructor
	public MMSavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		super(AccNo, AccNm, AccBal, isSalaried);
	}
	
	//ToString 
	
	@Override
	public String toString() {
		return "MMSavingAcc []";
	}

}
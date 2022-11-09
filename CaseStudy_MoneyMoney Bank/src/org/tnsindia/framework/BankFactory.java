package org.tnsindia.framework;

public abstract class BankFactory 
{
	// Abstract Methods
	
	abstract public SavingAcc getNewSavingAcc (int AccNo, String AccNm, float AccBal, boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc (int AccNo, String AccNm, float AccBal, float creditLimit);

}
package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;
import org.tnsindia.framework.BankFactory;

public class MMBankFactory extends BankFactory 
{
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		MMSavingAcc s=new MMSavingAcc(AccNo, AccNm, AccBal, isSalaried);
		return s;
	}
	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit ) 
	{
		MMCurrentAcc c=new MMCurrentAcc(AccNo, AccNm, AccBal, creditLimit);
		return c;
	}
}
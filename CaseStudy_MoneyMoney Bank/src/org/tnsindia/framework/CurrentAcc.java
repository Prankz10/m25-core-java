package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc
{	
	private final float creditLimit;

	public CurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) 
	{
		super(AccNo, AccNm, AccBal);
		this.creditLimit=creditLimit;
	}

	@Override
	public void withdraw(float AccBal)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Balance is: "+(AccBal + creditLimit));	
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}


}
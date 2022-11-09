package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalaried;
	@SuppressWarnings("unused")

	static final private float MINBAL=0.0f; 
	
	// Constructor
	public SavingAcc(int AccNo, String AccNm, float AccBal, boolean isSalaried) 
	{
		super (AccNo, AccNm, AccBal);
		this.isSalaried=isSalaried;
	}

	@Override
	public void withdraw(float AccBal)
	{
		System.out.println("Account No. is: "+this.getAccNo());
		System.out.println("Account Name: "+this.getAccNm());
		System.out.println("Account Balance is: "+(AccBal));
	}

	
	//ToString
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}

	
}
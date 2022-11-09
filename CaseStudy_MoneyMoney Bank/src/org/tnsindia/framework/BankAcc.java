package org.tnsindia.framework;

public abstract class BankAcc {
	// Fields
	private int AccNo;
	private String AccNm;
	private float AccBal;
	
	// Constructor
	public BankAcc(int AccNo, String AccNm, float AccBal) 
	{
		super();
		this.AccNo = AccNo;
		this.AccNm = AccNm;
		this.AccBal = AccBal;
	}
	// Getters and Setters Method for Private Variables
	public int getAccNo() 
	{
		return AccNo;
	}
	public void setAccNo(int AccNo) 
	{
		this.AccNo = AccNo;
	}

	public String getAccNm() 
	{
		return AccNm;
	}
	public void setAccNm(String AccNm) 
	{
		this.AccNm = AccNm;
	}

	public float getAccBal() 
	{
		return AccBal;
	}
	public void setAccBal(float AccBal) 
	{
		this.AccBal = AccBal;
	}	
	
	abstract public void withdraw (float AccBal);
	public void deposit (float AccBal)
	{
		System.out.println(AccBal);
	}
	
//ToString 
	@Override
	public String toString() {
		return "BankAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", AccBal=" + AccBal + "]";
	}

}
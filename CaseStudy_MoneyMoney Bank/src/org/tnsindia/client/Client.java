package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1241, "Pranit Jadhav" , 20000, true);
		CurrentAcc c=new MMCurrentAcc(1242, "Kamlesh", 100000, 60);
		

		System.out.println("Saving Account: ");	
		s.withdraw(s.getAccBal());
		
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(c.getAccBal());
		
		//System.out.println(s);
		//System.out.println(c);
	}

}
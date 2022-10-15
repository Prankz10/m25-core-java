package org.tnsindia.customexception;

import java.util.Scanner;

public class UserLoginCustomExceptionExecutorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		s.close();
		try {
			if(id!="catch.pranit1@gmail.com" && password!="abc@456")
				throw new LoginCredentials("Invalid Credentials");	
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}
		
	}
}
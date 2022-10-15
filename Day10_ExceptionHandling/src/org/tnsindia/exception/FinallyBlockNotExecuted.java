package org.tnsindia.exception;

public class FinallyBlockNotExecuted {
	
	public static void print()
	{
		try 
		{
			int x=12;
			int y=5;
			System.out.println("Inside try block- "+x/y);
	
			System.exit(0);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
		}
		
		finally
		{
			System.out.println("finally block");

		}
		
		{
			System.out.println("Finally block");
			int res=34/0;
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		print();
	}
}
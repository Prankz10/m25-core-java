package org.tnsinida.Operator;

import java.util.Scanner;

public class MultiplyOperator { 

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter the number:");
		int a=s.nextInt();
		System.out.print(" Enter the number:");
		int b=s.nextInt();
		a*=b;
		System.out.print(a);
		s.close();
	}
}
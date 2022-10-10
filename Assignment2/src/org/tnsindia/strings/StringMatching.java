package org.tnsindia.strings;

import java.util.Scanner;

public class StringMatching {

	public static void main(String[] args) {
		String str="Pranit";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();
	}
}
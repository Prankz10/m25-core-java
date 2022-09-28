package org.tnsindia.userinput;
import java.util.Scanner;
public class DemoOnChar {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		char x=s.next().charAt(2);
		System.out.println("The result is: ");
		System.out.print(x);
	}

}
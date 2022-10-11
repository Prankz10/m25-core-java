package org.tnsindia.interfaceexample;

import java.util.Scanner;

public class ShapeArea implements Area
{

	@Override
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
				double r=s.nextDouble();
				System.out.println("The area of circle is: " +3.142*r*r);
	}
	
	@Override
	public void square() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the side of square: ");
				double side=s.nextDouble();
				System.out.println("The area of square is: " +side*side);
	}
}

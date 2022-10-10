package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {
	
	static int a=10;
	static int b;
	static
	{
		b=a+50;
	}

	public static void main(String[] args) {
		System.out.println("The value of a is: " +a);
		System.out.println("The value of a is: " +b);
	}
}
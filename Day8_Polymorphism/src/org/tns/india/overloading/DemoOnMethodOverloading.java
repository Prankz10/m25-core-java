package org.tns.india.overloading;

class MathematicalOperation
{
	public void addition(int a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
	public void addition(float a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
}
public class DemoOnMethodOverloading {

	public static void main(String[] args) {
		MathematicalOperation m=new MathematicalOperation();
		m.addition(20, 75);
		m.addition(15.0f, 35);
	}
}
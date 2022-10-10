package org.tnsindia.thiskeyword;

class D
{
	D()
	{
		this(5);
		System.out.println("Default Constructor");
	}

	D(int i)
	{
		System.out.println("Parameterized Constructor");
	}
}
public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
		D d=new D();
	}
}
package org.tnsindia.thiskeyword;

class C
{
	public void display(C c)
	{
		System.out.println("Display function invoked");
	}

	public void print()
		{
		display(this);
	}
}
public class DemoOnThisKeywordAsMethodCall 
	{
	public static void main(String[] args) {
		C c=new C();
		c.print();
	}
}
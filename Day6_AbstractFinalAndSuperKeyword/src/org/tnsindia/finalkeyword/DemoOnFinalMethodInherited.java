package org.tnsindia.finalkeyword;

class A
{
	final void display()
	{
		System.out.println("Final method is inherited but not the override");
	}
}
class B extends A
{
	void print()
	{
		System.out.println("Child class");
	}
}
public class DemoOnFinalMethodInherited {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.print();
	}
}
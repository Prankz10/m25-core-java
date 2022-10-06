package org.tnsindia.abstractkeyword;
abstract class C
{
	void print()
	{
		System.out.println("Non-abstract method");
	}
	abstract void display();
	abstract void accept();
}
class D extends C
{
	void display() {
		System.out.println("Abstract method 1");
	}
	void accept() {
		System.out.println("Abstract method 2");
	}
}
public class DemoOnAbstractClass {

	public static void main(String[] args) {
		C c=new D();
		c.print();
		c.display();
		c.accept();
	}
}

package org.tnsindia.finalkeyword;
class FinalMethod
{
	void display() {
	}
}
class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child class");
	}
}
public class DemoOnFinalMethod {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept();
	}
}
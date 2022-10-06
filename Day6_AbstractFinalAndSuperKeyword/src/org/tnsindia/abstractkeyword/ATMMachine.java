package org.tnsindia.abstractkeyword;
abstract class A
{
	abstract void print();
}
class B extends A
{
	void print() {
		int balance=89000;
		System.out.println("Account balance is: "+balance);
	}
}
public class ATMMachine {
	public static void main(String[] args) {
		//we cannot create the object for abstract class
		/*A a=new A();*/
		A a=new B();
		a.print();
	}
}
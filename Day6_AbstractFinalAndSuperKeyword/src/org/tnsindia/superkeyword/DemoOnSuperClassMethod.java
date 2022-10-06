package org.tnsindia.superkeyword;
class Parent
{
	public void print()
	{
		System.out.println("Welcome to M25 Java Coere Batch");
	}
	public void accept()
	{
		System.out.println("Super class method");
	}
}
class Child extends Parent
{
	public void print()
	{
		System.out.println("Congratulation for your Selection");
	}
	public void accept()
	{
		System.out.println("child class method");
	}
	public void display()
	{
		print();
		accept();

		super.print();
		super.accept();
	}
}
public class DemoOnSuperClassMethod {

	public static void main(String[] args) {
		Child c =new Child();
		c.display();
	}
}
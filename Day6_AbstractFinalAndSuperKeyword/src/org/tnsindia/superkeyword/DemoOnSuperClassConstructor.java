package org.tnsindia.superkeyword;

class Person
{
	Person()
	{
		System.out.println("Parent class constructor");
	}
}
class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Child class constructor");
	}
}
public class DemoOnSuperClassConstructor {

	public static void main(String[] args) {
		System.out.print("The Class is:");
	}
}
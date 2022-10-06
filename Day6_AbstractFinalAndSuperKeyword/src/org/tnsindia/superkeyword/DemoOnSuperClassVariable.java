package org.tnsindia.superkeyword;
class Animal
{
	protected String name="They are pet animals.";
}
class Dog extends Animal
{
	public String name="Cat. ";
	public void display()
	{
		System.out.print("The name of the animal is: "+name);
		System.out.print(super.name);
	}
}
public class DemoOnSuperClassVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
	}
}
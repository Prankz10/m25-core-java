package org.tns.india.inheritance;

import java.util.Scanner;

class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The Animal is: "+name);
	}	
}

class Dog extends Animal
{
	public String Breed;
	public void print()
	{
		System.out.println("The Breed is: "+Breed);
	}	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the name of the animal: ");
		String name1=s.nextLine();
		System.out.print("Enter the breed of the animal: ");
		String Breed1=s.nextLine();
		Dog d=new Dog();
		d.Breed=Breed1;
		d.name=name1;
		d.display();
		d.print();	
	}
}
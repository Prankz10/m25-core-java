package org.tnsindia.superkeyword;

public class Derived extends Base{
		Derived()
		{
			System.out.println("Child Class constructor-Default");
		}
		Derived(int i)
		{
			super(i);
			System.out.println("Child Class constructor-Parameterized");
	}
}
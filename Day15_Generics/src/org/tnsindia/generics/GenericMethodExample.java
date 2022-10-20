package org.tnsindia.generics;

public class GenericMethodExample 
{
	//we can pass any types of arguments in the method
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}
	public static void main(String[] args) {
		//Integer Array
		Integer[] arr1= {11,22,33};
		//character array
		Character [] arr2= {'p','r','a'};
		System.out.println("Printing array for Integer");
		printArray(arr1);
		System.out.println("Printing array for Character");
		printArray(arr2);
	}
}
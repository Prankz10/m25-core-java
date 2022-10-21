package org.tnsindia.array;

import java.util.Arrays;

public class UsingArrays {
	static void display(int... a)
	{
		//
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		display(1,3,5,7,9,11,13);
	}
}
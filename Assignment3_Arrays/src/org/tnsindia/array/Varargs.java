package org.tnsindia.array;

public class Varargs 
{
	static void print(int a,int b, String... s)
	{
		System.out.println(a+","+b);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}
	public static void main(String[] args) {
		print(1,12,"Python","Java","C++","HTML");

	}
}
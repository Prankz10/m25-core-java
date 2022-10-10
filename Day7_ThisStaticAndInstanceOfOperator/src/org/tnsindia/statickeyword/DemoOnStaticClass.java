package org.tnsindia.statickeyword;

class C
{
	public static String str="Welcome to TNS India"; 

	static class D
	{
		public static  void print()
		{
			System.out.println(str);
		}
	}
}
public class DemoOnStaticClass {

	public static void main(String[] args) {
		C.D.print();
	}
}
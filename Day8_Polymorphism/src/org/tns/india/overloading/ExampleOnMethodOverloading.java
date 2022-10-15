package org.tns.india.overloading;

class Shape
{
	public void area()
	{
		System.out.println("Find area:");
	}

	public void area(int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}

	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
}
public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(2);
		s.area(10, 15);
	}
}
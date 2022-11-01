package org.tnsindia.enumdemo;

public class EnumCarDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//accessing enum 
		Car r1=Car.SUZUKI;
		System.out.println(r1);
		
		//using enhanced for loop
		for(Car c:Car.values())
		{
			System.out.println(c);
			System.out.println(c.HYUNDAI);
		}
	}
}
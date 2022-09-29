package org.tnsindia.absraction;
class B
{
	public String birthdate="23-09-1994";
	public void display()
	{
		System.out.println("The DOB is: "+birthdate);
		
	}
}
public class DemoOnPublic {

	public static void main(String[] args) {
		B b=new B();	
		b.display();

	}

}

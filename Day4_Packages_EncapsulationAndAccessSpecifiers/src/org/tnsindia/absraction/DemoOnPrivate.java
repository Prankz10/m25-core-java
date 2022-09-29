package org.tnsindia.absraction;
//demo on private access specifier
class A
{
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private float salary;
	
}
public class DemoOnPrivate {
	public static void main(String[] arg) {
		A a=new A();
		a.setSalary(60000);
		System.out.println("The Salary is:"+a.getSalary());
	}
}

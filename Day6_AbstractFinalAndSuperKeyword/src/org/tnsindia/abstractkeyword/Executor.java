package org.tnsindia.abstractkeyword;
public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("Pranit","Male",1021);
		Person p1=new Employee("Akshata","Male",0);
		System.out.println(p.toString());

		p.work();
		p1.work();
		p.changeName("Pranit1");
		System.out.println(p.toString());
	}
}
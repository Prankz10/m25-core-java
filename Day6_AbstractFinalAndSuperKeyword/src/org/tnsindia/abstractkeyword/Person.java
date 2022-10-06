package org.tnsindia.abstractkeyword;
public abstract class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public abstract void work();
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	public void changeName(String newName)
	{
		name=newName;
	}
}
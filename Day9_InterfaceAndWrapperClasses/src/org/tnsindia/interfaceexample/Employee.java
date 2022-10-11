package org.tnsindia.interfaceexample;

public class Employee implements HR, Manager {

	@Override
	public void projectdiscussion() {
		System.out.println("About the project discussion");
		
	}

	@Override
	public void salarydiscussion() {
		System.out.println("About the salary discussion");
		
	}

}

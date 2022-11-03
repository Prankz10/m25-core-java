package org.tnsindia.junit5demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display()
	{
		System.setProperty("Shiwani", "Kum");

		Assumptions.assumeTrue("Kum".equals(System.getProperty("Shiwani")));
	}
	@Test
	void display1()
	{
		System.setProperty("Shiwani", "Kum");

		Assumptions.assumeFalse("Kumbh".equals(System.getProperty("Shiwani")));
	}
	

}
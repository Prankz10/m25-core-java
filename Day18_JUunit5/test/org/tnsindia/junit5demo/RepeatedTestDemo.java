package org.tnsindia.junit5demo;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {
	@RepeatedTest(10)
	void test() {
		System.out.println("Hello M25");
	}
}
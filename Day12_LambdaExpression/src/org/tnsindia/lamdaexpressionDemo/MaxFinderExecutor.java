package org.tnsindia.lamdaexpressionDemo;

public class MaxFinderExecutor {

	public static void main(String[] args) {
		
		//lambda expression without return type
		MaxFinderDemo obj=(a,b)->a>b?a:b;
		System.out.println("The maximum no.is: " +obj.max(25, 45));
	}
}
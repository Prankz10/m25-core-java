package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<>();
		obj.add(45);
		obj.add(64);
		obj.add(98);
		System.out.println(obj);

		//stream api
		obj.forEach(System.out::println);	
	}
}
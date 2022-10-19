package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
			Stream<String>obj=Stream.of("Pranit","Sunny","Akshata");

			obj.forEach((i)->System.out.println(i+" "));
			
			System.out.println();
			
			List<Integer>obj1=Arrays.asList(new Integer[] {22,23,57,74}); 
			obj1.forEach((i)->System.out.println(i+" "));
	}
}
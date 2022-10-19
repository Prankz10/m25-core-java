package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Object> s=new HashSet<>();
		s.add("Praneet");
		s.add('S');
		s.add(55.7f);
		s.add(68);
		s.add("Pranit");
		s.add(null);
		s.add(null);
		System.out.println("The elements in the set are: "+s);
	}
}
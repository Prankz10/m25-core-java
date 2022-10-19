package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Object> s=new LinkedHashSet<>();
		s.add("Praneet");
		s.add('S');
		s.add(55.7f);
		s.add(68);
		s.add("Pranit");
		s.add(null);
		s.add(null);
		//to extract the elements from set
		for(Object itr:s)
		{
			System.out.println(itr);
		}
		System.out.println("The elements in the set are: "+s);
	}
}
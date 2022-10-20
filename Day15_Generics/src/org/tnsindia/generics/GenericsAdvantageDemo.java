package org.tnsindia.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(45);

		System.out.println(obj);
	
		List <Integer>obj2=new ArrayList<>();
		obj2.add(55);

		@SuppressWarnings("unused")
		Integer d=obj2.get(0);
		System.out.println(obj2);

	}

}
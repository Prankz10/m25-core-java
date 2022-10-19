package org.tns.india.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj=new ArrayList<>();
		//adding the values
		obj.add("Pranit");
		obj.add('Z');
		obj.add(45.92f);
		System.out.println("The elements in collections are: "+obj);
	}
}
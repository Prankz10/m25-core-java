package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Pranit");
		s.add("Akshata");
		s.add("Shreyas");
		s.add("Kamlesh");
		System.out.println("The elements in the TreeSet are: "+s);
	}
}
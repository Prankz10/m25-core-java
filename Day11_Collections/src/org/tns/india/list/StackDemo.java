package org.tns.india.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer>s=new Stack<>();
		//Push -Insertion
		s.push(1);
		s.push(5);
		s.push(8);
		System.out.println(s);
		//pop-Deletion
		s.pop();
		
		System.out.println(s);
	}
}
package org.tns.india.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Double> list=new Vector<Double>();
		list.add(0,65.90);
		list.add(1,78.65);
		System.out.println(list);
	}
}
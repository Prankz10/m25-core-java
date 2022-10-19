package org.tnsindia.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();

		obj.put(1,"Pranit");
		obj.put(4,"Akshata");
		obj.put(3,"Sunny");
		obj.put(2,"Shreyas");
		obj.put(null, null);
		obj.put(5, "Saish");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
package org.tns.india.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	
	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Shreyas");
		list.add("Kamlesh");
		list.add("Sunny");

		
		List<String> list1=new LinkedList<String>();
		list1.add("Akshata");
		list1.add("Saish");
		list1.add("Pratik");
		//using Iterator we can extract the elements of a list
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("The elements in List1 are: "+list);
		System.out.println("The elements in List2 are: "+list1);
		//contains()method is used to check whether list conatins that element or not 
		System.out.println(list.contains("Kamlesh"));
		//size is used to print the length
		System.out.println(list.size());
		//remove() is used to remove the specified index value
		System.out.println(list.remove(1));
		System.out.println("The elements are: "+list);
		//adding the list2 elements to list1
		list.addAll(list1);
		System.out.println("The elements in List1 are: "+list);
		list.removeAll(list1);
		System.out.println("The elements in List1 are: "+list);
		Collections.sort(list1);
		System.out.println("The elements in List2 are: "+list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("The elements in List2 are: "+list1);
	}
}
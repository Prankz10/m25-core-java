package org.tns.india.comparatordemo;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int emp1_age=((Employee) o1).getAge();
		int emp2_age=((Employee) o2).getAge();
		
		if(emp1_age> emp2_age)
		{
			System.out.println("Employee1 is greater");
		}
		else if(emp2_age>emp1_age)
		{
			System.out.println("Employee2 is greater");
		}
		else
		{
			System.out.println("Both are equal");
		}
		return 0;
	}
}
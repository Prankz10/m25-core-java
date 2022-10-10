package org.tnsindia.strings;  

import java.util.StringTokenizer;  

public class StringTokeniser 
{
	public static void main(String args[])
	{  
		StringTokenizer st = new StringTokenizer("Lets try this");  
	    System.out.println(st.nextToken());  
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	}  
} 
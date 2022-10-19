package org.tnsindia.lamdaexpressionDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaDemo {

	public static void main(String[] args) {
	
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("E:\\Java files");
		File contents[]=dir.listFiles(filter);
		for(File itr:contents)
		{
			System.out.println(itr);
		}
	}
}
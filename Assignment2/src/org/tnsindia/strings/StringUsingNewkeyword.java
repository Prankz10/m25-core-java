package org.tnsindia.strings;

import java.util.Scanner;

	public class StringUsingNewkeyword {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String str=new String(s.nextLine());
			System.out.println(str);
			s.close();
		}
	}
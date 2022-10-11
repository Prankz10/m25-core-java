package org.tnsindia.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoOnBufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any value: ");
		String str=r.readLine();
		System.out.print("Same value executed: ");
		System.out.println(str);
	}
}

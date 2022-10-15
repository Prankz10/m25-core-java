package org.tnsindia.interfaceexample;

import java.util.Scanner;

class Product implements Cloneable   
{  
	public int pid;  
	public String pname;  
	public double pcost;  
	//Product class constructor   
	public Product (int pid, String pname, double pcost)  
	{  
		this.pid = pid;  
		this.pname = pname;  
		this.pcost = pcost;  
	}  
	//clone method 
  public Object clone()throws CloneNotSupportedException{     
      return super.clone();  
  }  
	//
	public void showDetail()   
	{  
		System.out.println("Product ID: "+pid);  
		System.out.println("Product Name: "+pname);  
		System.out.println("Product Cost: "+pcost);  
	}  
}
public class InBuiltInterfaceDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		//  
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter product ID: ");  
		int pid = s.nextInt();  
		System.out.print("Enter product name: ");  
		String pname = s.next();  
		System.out.print("Enter product Cost: ");  
		double pcost = s.nextDouble();  
		System.out.println("-------Product Detail--------");  
		Product p1 = new Product(pid, pname, pcost);  
		//
      Product p2=(Product)p1.clone();  
		//
      System.out.printf("Original Product object: ");
      p1.showDetail();
      System.out.println("Cloned Product object: " );
      p2.showDetail();
		s.close();
		}  
}

package org.tnsindia.finalkeyword;

class FinalVariable
{
	public final float salary=70000;

}
public class DemoOnFinalVariable {

	public static void main(String[] args) {
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.salary);
	}
}
	package org.tnsindia.finalkeyword;
	class FinalClasss
	{
		protected String name="Pranitx`";
	}
	class ChildFinal extends FinalClasss
	{
		public void print()
		{
			System.out.println(name);
		}
	}
	public class FinalClass {

		public static void main(String[] args) {
			ChildFinal c=new ChildFinal();
			c.print();
		}
	}
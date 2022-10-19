package org.tns.india.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1 {

	public static void main(String[] args) {

		Queue<Character>list=new PriorityQueue<>();
		list.add('Z');
		list.offer('a');
		list.offer('s');
		list.offer('p');

		for(Character c:list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		list.poll();
		System.out.println(list);

		list.remove();
		list.remove();
		list.remove();
		
		System.out.println(list);
		list.remove();
		System.out.println(list);

		System.out.println(list.peek());
	}
}
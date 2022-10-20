package org.tnsindia.generics;

public class Sender <T>
{
	private T message;
	//getter 
	public T getMessage() {
		return message;
	}
	//setter 
	public void setMessage(T message) {
		this.message = message;
	}
	public void sendMessage()
	{
		System.out.println("Message Type includes: "+getMessage().getClass());
		System.out.println("Contents are in the email are: "+getMessage());
	}
}
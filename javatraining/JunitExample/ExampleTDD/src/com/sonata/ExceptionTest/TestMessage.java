package com.sonata.ExceptionTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;

public class TestMessage {
	
	String message = "sonata";
	
	MessageException mE = new MessageException(message);
	
	@Test(expected = ArrayIndexOutOfBoundsException.class )
	
	public void testprintMessage() {
		System.out.println("Inside the printMessage");
		mE.printMessage();
	}
	
	@Test
	public void testaddMessage() {
		System.out.println("Inside the message");
		
		assertEquals(message,mE.addMessage());
	}
	

}

package com.sonata;

public class FindArray {

	public static void main(String[] args) 
	{
		 int[] myArray = {55, 45, 35, 75};
	      int num = 25;

	      for(int i = 0; i < myArray.length; i++)
	      {
	         if(num == myArray[i]) 
	         
	            System.out.println("Array contains the given element");
	        
	            else if (num != myArray[i])
	            	
	            System.out.println("Array does not contains the given element");
	       } 
	}
}
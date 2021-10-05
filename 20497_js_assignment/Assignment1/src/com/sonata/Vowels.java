package com.sonata;

public class Vowels {

	public static void main(String[] args) 
	{
		 String string = "Hello welcome to java Session";   
	      string = string.replaceAll("[AaEeIiOoUu]", "$"); 
	      System.out.println(string);

	}

}

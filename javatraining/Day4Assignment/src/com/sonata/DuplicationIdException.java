package com.sonata;

public class DuplicationIdException extends Exception {
	String s;
	DuplicationIdException(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}
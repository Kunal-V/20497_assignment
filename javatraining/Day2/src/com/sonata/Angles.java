package com.sonata;

public class Angles implements AngleInterface {

	public static void main(String[] args) {
		Angles a1 = new Angles();
		Angles a2 = new Angles();
		Angles a3 = new Angles();
		System.out.print(a1.selectangle("triangle"));
		System.out.print(a2.selectangle("circle"));
		System.out.print(a3.selectangle("square"));

	}

	@Override
	public String selectangle(String val) {
		// TODO Auto-generated method stub
		return null;
	}

}

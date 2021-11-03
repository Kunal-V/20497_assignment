package com.sonata;
public class Square extends Shape {
	private int l;
	Square(int l){
		this.l=l;
	}
	public void area() {
		double area=l*l;
		System.out.printf("Area of Square:%.2f\n",area);
	}
}
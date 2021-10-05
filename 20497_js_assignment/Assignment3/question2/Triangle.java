package com.sonata;

public class Triangle extends Shape {
	private int l;
	Triangle(int l){
		this.l=l;
	}
	public void area() {
		double area=(Math.pow(3, 0.5)*0.25*l*l);
		System.out.printf("Area of Triangle:%.2f\n",area);
	}
}
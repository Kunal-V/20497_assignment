package com.sonata;

public class TestProduct {

	public static void main(String[] args) {
		Product p=new Product();
		double gst=18.25d;
		p.setProId(1);
		p.setProName("Earphones");
		p.setProPrice(1800);
		p.gstAdd(gst);
		System.out.println(p);
	}

}
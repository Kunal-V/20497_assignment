package com.sonata.Controller;

public class Product {
	
	private int proID;
	private String proName;
	private Double proPrice;
	
	public Product(int proID, String proName, Double proPrice ) {
		super();
		this.proID = proID;
		this.proName =proName;
		this.proPrice = proPrice;
		}
	

	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		proPrice = proPrice;
	}

}

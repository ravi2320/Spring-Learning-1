package com.springcore.lifecycle;

public class Vadapav {
	private double price;

	
	public Vadapav() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Vadapav(double price) {
		super();
		this.price = price;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vadapav [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}

package com.demo.model;

import java.util.ArrayList;

public class Shop {
	private String name;
	private String staffNames[];
	private int size;
	ArrayList<String> products;
	
	public Shop() {
		products = new ArrayList<String>();
		products.add("USB");
		products.add("Laptop");
		products.add("Earphones");
	}
	
	
	
	public ArrayList<String> getProducts() {
		return products;
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffNames() {
		return staffNames;
	}
	public void setStaffNames(String[] staffNames) {
		this.staffNames = staffNames;
	}
	
	
}

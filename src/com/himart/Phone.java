package com.himart;

public class Phone extends Product{
	
	private String Company;
	
	public Phone() {
		this.setCompany("Samsung");
		this.setBrand("Flip");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	
	
	public void info () {
		super.info();
		System.out.println("Company : "+this.getCompany());
	}

}

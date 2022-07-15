package com.unit;

public abstract class AirUnit extends Unit {
	
	private int wing;
	
	public AirUnit() {
		super(50);
	}
	
	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	
}

package com.terran;

import com.unit.AirUnit;

public class Cruiser extends AirUnit {
	
	public void move () {
		System.out.println("이동");
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	public void attact() {
		System.out.println("공격");
	}
}
package com.terran;

import com.unit.Unit;

public class Scv extends Unit {

	public Scv() {
		super(30);
	}
	
	public void move() {
		System.out.println("이동");
	}
	
	
	public void attack() {
		System.out.println("공격");
	}
	
	public void work() {
		System.out.println("일하기");
	}
	
}

package com.zerg;

import com.unit.Unit;

public class Hydra extends Unit {

	public Hydra() {
		super(50);
	}
	
	public void move () {
		System.out.println("이동");
	}
	
	public void attact() {
		System.out.println("공격");
	}
}

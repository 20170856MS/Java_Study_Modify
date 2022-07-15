package com.main;

import java.util.Scanner;

import com.terran.Marine;


public class Main {

	public static void main(String[] args) {
		Marine m1 =new Marine();
		m1.setHp(50);
		m1.setColor("black");
		m1.info();
		m1.move();
	}

}

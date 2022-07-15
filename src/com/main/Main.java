package com.main;

import java.util.Scanner;

import com.terran.Marine;
import com.unit.Unit;


public class Main {

	public static void main(String[] args) {
		Marine m1 =new Marine();
		m1.setHp(50);
		m1.setColor("black");
		m1.info();
		m1.move();
		
		Unit unit = m1;
		//Marine is a Unit
		//Unit이 접근 가능한건 자신이 알고있는 것 까지
		
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		System.out.println(unit.getClass());
	
		
		m1 = (Marine)unit;  //형변환
		System.out.println(m1.getWeapon());
	}
	

}

package com.animal;

public class Zoo {
	
	//멤버벼수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//클래스변수
	public static String title="사파리";
	
	//인스턴스변수
	//final이 붙으면 전부 대문자로
	public final int PRICE=50000;//MAX_VALUE
	
	
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]){}
	//클래스메서드
	public static void info() {
		System.out.println("Static Mathod");
		System.out.println(Zoo.title);
		
		//stack에 메인이 실행되기 전에 static 실행 => price 객체를 만들지 못하여 오류 발생
		//System.out.println(price);
		//getPrice();
		
	}
	
	//인스턴스메서드
	public void getPrice() {
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	
}

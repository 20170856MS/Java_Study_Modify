package com.ex1;

public class Iu {
	
	private String name;
	private int age;
	
	//Setter : 값을 집어넣기 위함
	//public void set변수명(데이터타입 변수면)
	//Getter : 데이터를 꺼내가기 위함
	//public 리턴타입 get변수명(){return }
	
	//Source => Generate Getters and Setters... => getter setter 자동생성
	
	//public final void Iu(){}
	private static Iu iu=null;
	private static Iu iu2=null;

	public static Iu getInstance() {
		if(Iu.iu == null) {
			Iu.iu =new Iu();
		}
		return new Iu();
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

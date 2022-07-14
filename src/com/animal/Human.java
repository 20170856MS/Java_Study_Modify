package com.animal;

public class Human {
	
	private int age;
	
	public int getAge() {
		return this.age;
	}

	public void info() {
		System.out.println(this.age);
	}
	public void setAge(int age) {
		this.age=0;
		if (age<150 && age >0) {
			this.age=age;	
		}else {
			age=0;
		}
	}
	
	public void myPet() {
		//Cat cat = new Cat();
		//cat.age = 10;
		//cat.sound();
		
	}
}

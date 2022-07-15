package com.main;

import java.util.Scanner;

import com.animal.Cat;
import com.animal.Human;
import com.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		//Cat cat = new Cat();
		//cat.sound();
		//cat.age=5;
		Human human = new Human();
		//human.age = 20;
		System.out.println("나이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int pull = sc.nextInt();
		human.setAge(pull);
		human.info();
		human.getAge();
		
		
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
		//final => 변경 불가능
		//zoo.price=10000;
		
	}

}

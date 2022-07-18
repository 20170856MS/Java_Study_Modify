package com.main;

import java.util.Scanner;

import com.util.CollectionStack;


public class Main {

	public static void main(String[] args) {
		//1. com.util.CollectionStack 클래스생성
		//		add - 입력받은 새로운 숫자 추가 무조건 0번에 추가
		//		remove - 0번 인덱스를 삭제
		//2. com.util.CollectionQue
		//		add - 입력받은 새로운 숫자를 0번에 추가
		//	 	remove - 마지막 인덱스를 삭제
		//3. com.util.CollectionSet
		//		add - 마지막 인덱스에 새로운 숫자 추가 #단 중복되지 않는 숫자만 추가
		//		remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
		
		
		//test data set
		int [] numbers = {1, 2, 3};
		String name = new String();
		char ch = name.charAt(1);
		CollectionStack cs = new CollectionStack();
		
		cs.add(numbers);
		
	}
	

}

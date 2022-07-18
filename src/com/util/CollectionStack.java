package com.util;

import java.util.Scanner;

public class CollectionStack implements Collection {

	@Override
	public int[] add(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 숫자를 입력하세요");
		int addNumber = sc.nextInt();
		int [] nums = new int [numbers.length];
		for(int i=1;i<numbers.length;i++) {
			nums[i] = numbers[i-1];
		}nums[0]= addNumber;
		
		return nums;
	}

	@Override
	public int[] remove(int[] numbers) {
		System.out.println("숫자를 삭제합니다");
		
		return null;
	}

}

package com.kita.first.level2.practice;

import java.util.Scanner;

public class practice11 {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원

//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원

		Scanner scan = new Scanner(System.in);
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		int num;
		int total=0;
		
		System.out.println("--메뉴--");
		for(int i=0; i<menuArr.length; i++) {
			//1. 콜라 900원
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		System.out.println();
		
		while(true) {
//			메뉴를 입력하세요(0 입력 시 종료): 0
//			콜라 900원
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): 0");
			num = scan.nextInt();
			
			//1. 0인지 아닌지
			//2. 범위
			
			
		}
	}

}

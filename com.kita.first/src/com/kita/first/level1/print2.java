package com.kita.first.level1;

public class print2 {
	public static void main(String[] args) {
		String name = "김성규";
		int age = 345;
		
		// 제 이름은 김성규이고 나이는 345세입니다. 
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "세입니다.");
		
//		System.out.printf("문자열 형식", 변수1, 변수2, ...);
		System.out.printf("제 이름은 %s이고 나이는 %5d세입니다.\n", name, age);
		
		double grade = 3.33333333333333;
		System.out.printf("제 학점은 평균 %.1f입니다.", grade);
	}

}

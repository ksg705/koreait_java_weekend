package com.kita.first.level2;

public class Method1 {
	public static void main(String args) {
//		int n1 = 2;
//		int n2 = 3;
//		System.out.println(n1 + n2);
		
		
		Method1.sum(2, 3);
		
	}
	
//	public static 리턴타입 메소드명(매개변수1, 매개변슈2, ...) {
//		코드
//		return 리턴타입 값;
//	}
//	
//	void형 메소드
//	public static void 메소드명(매개변수1, 매개변수2,...) {코드
//		
//	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	// 비 void형으로 리턴 타입이 int인 minus 메소드
	// 매개변수1, 2 전부 int 타입
	// 매개변수1에서 매개변수2를 뺀 값을 리턴
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return n1 - n2;
	}
}

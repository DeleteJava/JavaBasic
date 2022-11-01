package io;

public class Ex03 {
	public static void main(String[] args) {
		// 자료형 : 데이터 타입을 의미
		// 1. 문자열	: " "(쌍따옴표)로 묶인 데이터. 단어나 문장을 표현하는 타입
		// 2. 문자	: ' '(홑따옴표)로 묶인 데이터. 글자 하나를 표현하는 타입
		// 3. 정수	: 따옴표가 없는 숫자 데이터. 연산을 위한 타입
		// 4. 실수	: 숫자 중 소수점(.)이 있는 데이터. 
		
		System.out.println("10");
		System.out.println(10);
		System.out.println(10.0);
		System.out.println();
		
		
		// Java의 문자열은 + 연산시 이어붙는다
		System.out.println("Apple" + "Banana");
		System.out.println("10" + "20");
		System.out.println();
		
		
		// 정수와 실수는 연산을 위한 타입
		System.out.println(10 + 20);
		System.out.println(10.5 + 3.141592);
		
	}
}

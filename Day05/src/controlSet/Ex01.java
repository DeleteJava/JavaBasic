package controlSet;

import java.util.Scanner;

// 제어문 : 코드의 흐름을 제어하는 구문
// 1. 조건문 : 참/거짓에 따라서 코드를 분기
// 2. 반복문 : 참/거짓에 따라서 코드를 루프
// 3. 보조 제어문 : 위의 구문을 보조하는 구문

public class Ex01 {
	public static void main(String[] args) {
		// 조건문 if : 조건식을 검사해서 참이면 종속문장을 수행한다
		// ※ 종속문장 : 특정 영역에 포함된 문장을 의미
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		
		if (age >= 20) {
			System.out.print("성인");
		}
		
		else {		// else : if의 보조구문. 위의 조건이 거짓이면 종속문장을 수행
			System.out.print("미성년자");
		}
	
		System.out.println(" 입니다");
		sc.close();
		
	}
}

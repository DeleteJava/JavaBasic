package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 조건문 : 조건문 안에 조건문을 구성하는 방식
		// - 상세 조건 처리가 필요할때 사용한다
		// - 너무 많이 사용하면 가독성을 해치기 때문에 적당히 조절할 것
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수");
			
			if (num % 3 == 0) {
				System.out.println("짝수이며 3의 배수입니다~~");
			}
			else {
				System.out.println("짝수이지만 3의 배수는 아님!");
			}
		}
		else {
			System.out.println("홀수");
			
			// 홀수이며 3의 배수를 구분해서 출력해 보세요~
			if (num % 3 == 0) {
				System.out.println("홀수이며 3의 배수입니다~~~");
			}
			else {
				System.out.println("홀수이지만 3의 배수는 아님!");
			}
		}
	
		sc.close();
		
	}
}

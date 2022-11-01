package controlSet;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 선택문
		// - 선택한 값으로 코드를 분기
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴 (1 ~ 3) ");
		menu = sc.nextInt();
		
		
		switch(menu) {		// 조건식이 아닌 값을 쓴다	(정수, 문자열만 가능)
		case 1:
			System.out.println("1번 선택~");
			break;			// break : 제어문을 '즉시' 탈출
		case 2:
			System.out.println("2번 선택~");
			break;
		case 3:
			System.out.println("3번 선택~");
			break;
		default :			// 없는 case는 모두 여기서 처리된다
			System.out.println("없는 메뉴 입니다!!!");
		}
		
		System.out.println("\n종료~~");
		sc.close();
	}
}

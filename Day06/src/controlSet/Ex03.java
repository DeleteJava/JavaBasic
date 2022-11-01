package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// Java의 switch문은 문자열도 처리 가능
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("========== 메뉴 ==========");
		System.out.println("\t1. 짜장면");
		System.out.println("\t2. 짬뽕");
		System.out.println("\t3. 볶음밥");
		System.out.println("\t4. 탕수육");
		
		System.out.print("\n>>> ");
		menu = sc.next();
		
		switch(menu) {
		case "짜장면": case "1":
			System.out.println("짜장면 주문이요~~");
			break;
		case "짬뽕": case "2":
			System.out.println("짬뽕 주문이요~~");
			break;
		case "볶음밥": case "3":
			System.out.println("볶음밥 주문이요~~");
			break;
		case "탕수육": case "4":
			System.out.println("탕수육 주문이요~~");
			break;
		default :
			System.out.println("그런 메뉴는 없습니다 손님");
		}
		
		sc.close();
		
	}
}

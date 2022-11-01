package loop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 반복의 종류
		// 1. 지정 횟수 반복		: 횟수가 있는 반복. ex) 5번, 10번 반복 등
		// 2. 불특정 횟수 반복	: 횟수가 마땅히 없는 반복. ex) 종료를 누를때 까지 등
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		
		
		while (n != 0) {
			System.out.print("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		
		
		System.out.println("종료~~");
		sc.close();
	}
}

package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 절대값을 출력
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		if (n < 0) { 
			n *= -1; 
		}
		
		System.out.println("절대값은 " + n + "입니다~");
		
	
		// 2. 두 정수를 입력 받아서 큰 수를 출력
		// 단, 같은 경우는 같다라고 출력
		// ex) 입력 : 10 10 -> 출력 : 두 수는 같다
		int n1, n2;
		
		System.out.print("\n2. 두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("n1 = " + n1 + "(이)가 큰 수");
		}
		else if (n1 < n2) {
			System.out.println("n2 = " + n2 + "(이)가 큰 수");
		}
		else {
			System.out.println("두 수는 같다");
		}
		
		
		// 3. 세 정수를 입력 받아서 가장 큰 수를 출력
		// 단, 같은 경우는 아무거나 출력
		// ex) 입력 : 10 30 20 -> 출력 : 30
		// ex) 입력 : 30 30 30 -> 출력 : 30
		int a, b, c;
		int max = 0, min = 0;
		
		System.out.print("\n3. 세 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		min = max = a;

		// 최대값
		if (max < b) { max = b; }
		if (max < c) { max = c; }
		
		// 최소값
		if (min > b) { min = b; }
		if (min > c) { min = c; }
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		sc.close();
	}
}

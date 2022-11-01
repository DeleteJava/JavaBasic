package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.print("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			if (n == 0) {
				break;		// 제어문을 '즉시' 탈출
			}
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}

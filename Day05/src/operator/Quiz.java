package operator;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. 정수 두 개를 입력 받아서 큰 수를 출력
		// 단, 같은 경우는 아무거나 출력
		// ex) 입력 : 5 2 -> 출력 : 5
		// ex) 입력 : 5 5 -> 출력 : 5
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("1. 두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int big = (n1 > n2) ? n1 : n2;
		
		System.out.printf("%d와 %d 중 큰 수는 %d입니다\n\n", n1, n2, big);
		
		
		// 2. 정수를 입력 받아서 짝수이며 5의 배수를 출력
		// ex) 입력 : 15 -> 출력 : 짝수이며 5의 배수 아님
		// ex) 입력 : 10 -> 출력 : 짝수이며 5의 배수
		int n;
		
		System.out.print("2. 정수 입력 : ");
		n = sc.nextInt();
		
		String result = (n % 2 == 0 && n % 5 == 0) ? "공배수" : "공배수 아님";
		
		System.out.println(n + "(은)는 2와 5의 " + result + "\n");
		
		
		// 3. 정수를 입력 받아서 절대값을 출력
		// ex) 입력 : 5  -> 출력 : 5
		// ex) 입력 : -5 -> 출력 : 5
		System.out.print("3. 정수 입력 : ");
		n = sc.nextInt();
		
		n = (n < 0) ? -n : n;
		
		System.out.println("절대값 : " + n);
		sc.close();
	}
}

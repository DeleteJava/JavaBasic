package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5
		// ex) 입력 : 3 -> 출력 : 1 2 3
		Scanner sc = new Scanner(System.in);
		int n, i = 1;
		
		System.out.print("1. 정수 입력 : ");
		n = sc.nextInt();
		
		while (i <= n) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		// 2. 1번을 거꾸로 출력
		// ex) 입력 : 5 -> 출력 : 5 4 3 2 1
		// ex) 입력 : 3 -> 출력 : 3 2 1
		i = n;
		
		int sum = 0;
		
		while (i >= 1) {
			System.out.print(i + " ");
			
			sum += i;	// sum = sum + i;
			i--;
		}
		
		
		// 3. 정수를 입력 받아서 1 ~ n까지의 합계를 출력
		// ex) 입력 : 5 -> 출력 : 15
		// ex) 입력 : 3 -> 출력 : 6
		System.out.println("\n\n3. " + sum);
		
		
		// 4. 입력 받은 정수를 거꾸로 출력해본다
		// ex) 입력 : 123 -> 출력 : 321
		// ex) 입력 : 5348 -> 출력 : 8435
		int rev = 0;
		
		System.out.print("\n4. 거꾸로 수 : ");
		n = sc.nextInt();
		
		while(n != 0) {
			rev = rev * 10 + n % 10;
			
			n /= 10;
		}
		
		System.out.println("rev = " + rev);
		
		sc.close();
		
	}
}

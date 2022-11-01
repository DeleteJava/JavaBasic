package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// pdf 10p) 2번
		Scanner sc = new Scanner(System.in);
		int usb = 5000;			// USB 1개 가격
		int n, total;			// 구매 개수 및 총 금액
		
		
		System.out.print("구매 개수? ");
		n = sc.nextInt();
		
		// 원가를 구한다
		total = usb * n;
		
		// 개수에 따른 할인율을 적용한다
		if (n >= 100) {
			total *= 0.88;		// total = total * 0.88;
								// Java의 복합 대입연산자는 좌변의 자료형으로 자동 형변환 된다~
		}
		else if (n >= 10) {
			total *= 0.9;		
		}
		
		
		System.out.println("총 금액 : " + total + "원");
		
		sc.close();
		
	}
}

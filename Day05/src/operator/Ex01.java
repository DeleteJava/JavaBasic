package operator;

import java.util.Scanner;

// 일항 : 증감. ex) a++
// 이항 : 산술, 대입, 비교, 논리 등. ex) a + b, a > b
// 삼항 : 조건. ex) 조건식 ? 참 : 거짓

public class Ex01 {
	public static void main(String[] args) {
		// 조건 연산자 : 조건에 따라서 값을 선택하는 연산자
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		String even = (n % 2 == 0) ? "짝수" : "홀수";
		//	   even = "짝수";			(ex. n = 6일때)
		//     even = "홀수";			(ex. n = 7일때)

		
		System.out.println(n + "(은)는 " + even + "입니다");
		sc.close();
	}
}

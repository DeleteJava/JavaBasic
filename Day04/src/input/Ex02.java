package input;

// import 외부 파일을 불러오는 키워드

import java.lang.System;		// lang : 개발에 꼭 필요한 클래스를 모아둔 패키지 (자동 import 됨)
import java.util.Scanner;		// util : 유용한 유틸리티를 모아둔 클래스

								// ※ lang을 제외한 모든 패키지는 자동으로 import 되지 않는다
public class Ex02 {
	public static void main(String[] args) {
		// 데이터를 쉽게 읽어올 수 있게 도와주는 도구가 있는데
		// Scanner라고 하는 클래스다
		
		Scanner sc;
		int n;
		
		sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		System.out.println("입력 받은 n = " + n);
		
		
		sc.close();
		// - Scanner는 다 쓰고 마지막에 닫아주면 좋다
	}
}

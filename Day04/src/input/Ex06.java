package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// Scanner의 next()와 nextLine()
		// 1. next()
		// - space와 enter를 구분자로 인식
		// - 이전에 남은 space, enter는 알아서 비운다
		//
		// 2. nextLine()
		// - enter만 구분자로 인식. enter도 가져온다
		// - 이러한 특성 때문에 이전에 남은 enter를 인식하는 문제가 발생할 수 있다
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("띄어쓰기 포함 입력 : ");
//		str = sc.next();
		str = sc.nextLine();
		
		System.out.println("str = " + str);
		
		sc.close();
	}
}

package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 버퍼 (buffer) : 데이터를 임시로 보관하는 공간
		// - 1. Scanner는 먼저 buffer의 내용을 살핀다
		// - 2. buffer에 데이터가 없으면 사용자에게 입력을 요구한다
		// - 3. 입력이 완료 후 버퍼는 데이터를 순차적으로 가져온다
		// - ※ 여기서 구분자는 space와 enter가 된다
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		
		System.out.printf("n1 = %d, n2 = %d\n\n", n1, n2);
		
		sc.nextLine();
		// - 버퍼에서 enter까지 모두 가져오는 구문 
		// - space를 구분자로 인식하지 않음
		
		
		int n3, n4;
		
		System.out.print("다시 두 정수 입력 : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n", n3, n4);
		
		
		sc.close();
	}
}

package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 구구단 2단을 출력한다 (단, x1 ~ x9까지)
		// 2. 1번을 완료 후 입력으로 전환해서 입력 받은 구구단이 나오게 한다
		// 3. 2번을 완료 후 거꾸로 x9 ~ x1로 출력해 본다

		Scanner sc = new Scanner(System.in);
		int dan;
		int i = 1;
		
		System.out.print("몇 단? ");
		dan = sc.nextInt();
		
		while (i <= 9) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i++;
		}
		
		System.out.println();
		
		
		// 거꾸로
		i = 9;
		
		while (i >= 1) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			i--;
		}
		
		sc.close();
	}
}

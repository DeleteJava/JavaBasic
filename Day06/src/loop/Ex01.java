package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문 while
		// - 조건식이 참이면 종속 문장을 수행
		// - 종속문장이 끝나면 다시 조건으로 올라온다
		
		int i = 1;			// 반복의 초기값
		
		while (i <= 5) {	// 반복의 조건식
			System.out.println(i + " : Hello World!!!");
			i++;			// 반복의 증감식
		}
		
		
		System.out.println("반복 후 i = " + i + "\n");
		
		
		// 연습) 5 ~ 1 : Hello World를 반복으로 출력
		i = 5;
		
		while (i >= 1) {
			System.out.println(i + " : Hello World!!!");
			
			i--;
		}
		
		System.out.println("반복 후 i = " + i);
	}
}

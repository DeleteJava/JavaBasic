// 2번 패키지
package input;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// System.out	: 출력 객체
		// System.in 	: 입력 객체
		
		int n;
		
		System.out.print("문자 하나 : ");
		n = System.in.read();
		
		System.out.println("n = " + (char)n);
		
		// System.in은 그냥 단독으로 사용시 불편한 점이 많다
		// - 1. 예외 처리를 알아야 한다 -> 뒤에 배워요
		// - 2. 키값을 하나 밖에 못 읽는다 -> 보조 스트림이 필요
		//
		// 결론은 자바 초반에 써먹기 힘들다
		
	}
}

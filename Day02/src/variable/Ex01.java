// 2번. 패키지

package variable;

// ctrl + space : 이클립스의 자동완성

public class Ex01 {
	public static void main(String[] args) {
		// 변수 : 데이터를 저장하는 공간. 변하는 수
		//
		// 선언 방식)
		// 1. 자료형 변수명 = 값;
		// 2. 자료형 변수명;
		
		int n = 10;					// =은 대입 연산자 : 공간에 값을 할당하는 연산자
		
		System.out.println("n");
		System.out.println(n);		// 변수의 호출 : 앞서 선언된 변수에 저장된 값을 참조
		
		
		System.out.println("n = " + n);
		
		
		n = 20;
		// - 기존에 이미 만들어진 변수를 재사용시 자료형은 붙이지 않는다
		// - 만약 붙이면 중복 선언이 되어서 에러~
		
		System.out.println("n = " + n);
	}
}

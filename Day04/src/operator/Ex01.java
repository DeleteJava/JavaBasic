// 1번 패키지
package operator;

public class Ex01 {
	public static void main(String[] args) {
		// 논리 연산자 : true/false를 연산
		// 종류 : &&, ||, !
		
		
		// 1. AND : &&, 양쪽 모두 참이면 결과가 참
		// - 다른 말로 곱(*)연산이라고 한다
		System.out.println("true  and ture  결과 : " + (true && true));
		System.out.println("true  and false 결과 : " + (true && false));
		System.out.println("false and ture  결과 : " + (false && true));
		System.out.println("false and false 결과 : " + (false && false));
		System.out.println();
		
		
		// 2. OR : ||, 양쪽 모두 거짓이면 결과가 거짓
		// - 다른 말로 합(+)연산이라고 한다
		System.out.println("true  or ture  결과 : " + (true || true));
		System.out.println("true  or false 결과 : " + (true || false));
		System.out.println("false or ture  결과 : " + (false || true));
		System.out.println("false or false 결과 : " + (false || false));
		System.out.println();
		
		
		// 3. NOT : !, 참을 거짓으로 거짓을 참으로 바꾸는 연산
		// - 다른 말로 부정(= 반전)연산이라고 한다
		System.out.println("not true  결과 : " + !true);
		System.out.println("not false 결과 : " + !false);
		
	}
}

package operator;

public class Ex05 {
	public static void main(String[] args) {
		// 비교(관계) 연산자 : 데이터의 대소관계를 비교하는 연산자
		// 종류 : >, <, >=, <=, ==, !=
		//
		// 비교의 결과는 boolean 타입. 즉, true/false
		
		int n = 10;
		
		System.out.println("n > 3 결과 : " + (n > 3));
		System.out.println("n < 3 결과 : " + (n < 3));
		
		System.out.println("n < 10 결과 : " + (n < 10));
		System.out.println("n <= 10 결과 : " + (n <= 10));
		
		System.out.println("n == 10 결과 : " + (n == 10));	// 같으면 참, 다르면 거짓
		System.out.println("n != 10 결과 : " + (n != 10));	// 같으면 거짓, 다르면 참
		
		
		// 비교의 결과는 boolean이라고 했고
		// 당연히 변수에 저장이 가능하다~~~
		
		boolean result = (10 == 9);
		//		result = false;
		
		System.out.println("\nresult = " + result);
		
		
	}
}

// 3번 패키지
package operator;

// 연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
// - 종류 : 산술, 대입, 증감, 비교, 논리, 조건 등

public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산자 : 사칙 연산을 수행
		// 종류 : +, -, *, /, %
		
		int n = 10;
		
		System.out.println("n + 3 = " + (n + 3));
		// - 산술 연산자는 변수에 영향을 주지 않는다
		
		System.out.println("n = " + n + "\n");
		
		
		System.out.println("n - 3 = " + (n - 3));
		System.out.println("n * 2 = " + n * 2);
		System.out.println("n / 3 = " + n / 3);
		System.out.println("n % 3 = " + n % 3 + "\n");
		
		
		// 나머지의 사용처?
		// 1. 배수 구분
		// 2. 수의 범위 제한
		// 3. 수의 자리수 추출
		
		int num = 123456;
		
		System.out.println(num % 10);
		System.out.println(num / 100000);
		System.out.println(num % 1000 / 100);
		System.out.println();
		
		
		int birth = 991215;		// 생년월일
		
		System.out.println("생년 : " + birth / 10000); 		// 생년 : 99
		System.out.println("생월 : " + birth / 100 % 100); 	// 생월 : 12
		System.out.println("생일 : " + birth % 100); 			// 생일 : 15
		
	}
}

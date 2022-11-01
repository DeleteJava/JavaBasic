// 2번 패키지
package casting;

// 형변환(casting) : 자료형을 변환하는 작업
// 1. 자동 형변환 : 다른 타입을 서로 연산시 발생하며, 큰 타입으로 변환된다
// 2. 강제 형변환 : 개발자가 명시한 타입으로 변경

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("10" + "20");
		
		System.out.println("10" + 20);
		// 1. "10" + 20 	--> Stirng + int (타입이 달라서 연산x)
		// 2. "10" + "20"	--> int가 String으로 변환 (타입이 맞아졌다)
		// 3. = "1020"
		
		System.out.println();
		
		System.out.println(10.0 + 3.14);
		System.out.println(10 + 3.14);
		// 10 + 3.14 			--> int + double (연산 x)
		// 10.0 + 3.14 = 13.14
		
		
		// 아래 두 구문을 비교해 보세요~
		System.out.println("\n10 + 2 = " + 10 + 2);
		
		System.out.println("10 + 2 = " + (10 + 2));
		
	}
}

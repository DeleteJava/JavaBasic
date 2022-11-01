package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자 : 값을 할당하는 연산자
		// 종류 : =
		//
		// 1. 대입 연산의 좌변은 '공간', 우변은 '결과값'
		// 2. 대입 연산은 항상 우변부터 수행한다
		// 3. 대입 연산은 양변의 자료형을 항상 일치 시킨다
		
		
		int n = 10 + 20;

		System.out.println("n = " + n + "\n");
		
		
		int n1, n2, n3;
		
		n1 = n2 = n3 = 30;
		// 가장 우변부터 수행
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		
		
	}
}

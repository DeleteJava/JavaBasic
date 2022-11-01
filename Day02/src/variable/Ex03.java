package variable;

public class Ex03 {
	public static void main(String[] args) {
		// 앞서 배운 자료형을 '기본 자료형'이라고 한다
		// - 이를 제외한 모든 타입을 '참조 자료형'이라고 한다
		// - 대표적으로 클래스와 배열이 있다
		
		// 기본 타입 : 변수에 데이터가 직접 저장된다
		int n = 10;
		
		// 참조 타입 : 실제 데이터를 '가리킨다'
		// 1. 배열
		int[] arr = new int[] { 10,20,30 };
		
		// 2. 클래스 (※ Pythontutor에서 참조 처럼 그려주지 않는다)
		String str = "Hello Java";
		
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr);
		
		System.out.println("str = " + str);
		
	}
}

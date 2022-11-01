// 1번 패키지
package variable;

public class Quiz {
	// 1. main 함수를 작성한다
	public static void main(String[] args) {
		// 2. 이름, 나이, 키, 성별, 주소를 저장할 변수를 선언한다
		// 단, 성별은 char로 선언할 것
		String name, address;
		int age;
		double height;
		char gender;
		
		
		// 3. 2번의 변수에 값을 채운다
		name = "홍길동";
		age = 17;
		height = 171.1;
		gender = '남';
		address = "부산 광역시 해운대구 센텀로";
		
		
		// 4. 저장한 변수를 아래와 같이 출력한다
		//
		// 결과)
		// 이름 : 홍길동, 17세
		// 신장 : 171.1cm
		// 성별 : 남
		// 주소 : 부산 광역시 해운대구 센텀로

		System.out.println("이름 : " + name + ", " + age + "세");
		System.out.println("신장 : " + height + "cm");
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		
		
		System.out.printf("\n이름 : %s, %d세\n", name, age);
		// %s : string, 문자열 자리
		// %d : decimal, 10진 정수 자리
		// %c : character, 단일 문자 자리
		// %f : float, 실수 자리 (기본 소수점 6자리)
		// %.nf : n자리만큼 소수점을 제어
		
	}
	
}

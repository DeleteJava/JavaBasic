package casting;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 저장할 변수를 선언한다
		// 단, 국 영 수는 정수로 선언할 것
		String name;
		int kor, eng, mat;
		
		
		// 2. 1번의 변수에 값을 저장한다
		name = "홍길동";
		kor = 70;
		eng = 80;
		mat = 98;
		
		
		// 3. 결과는 아래와 같다
		// 
		// 결과)
		// 이름 : 홍길동 (국 70, 영 80, 수 98)
		// 합계 : 248
		// 평균 : 82.67
		
		
		String result = "이름 : %s (국 %d, 영 %d, 수 %d)\n";
		int sum = kor + eng + mat;
		
		System.out.printf(result, name, kor, eng, mat);
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", sum / 3.0);
		
		
	}
}

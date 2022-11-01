package input;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 나이, 성별, 신장, 주소를 입력 받을 변수를 선언한다
		// 단, 성별은 char로 선언
		String name, address;
		int age;
		char gender;
		double height;
		
		
		// 2. 1번의 변수에 Scanner를 활용해서 입력을 받는다
		// 단, 신장 다음 바로 주소를 입력 받아 보세요~
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("신장 : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("주소 : ");
		address = sc.nextLine();
		
		
		// 3. 입력받은 결과는 아래와 같다
		// 
		// 결과)
		// 이름 : 홍길동 (23세, 여)
		// 신장 : 167.3cm
		// 주소 : 부산광역시 해운대구 센텀 우2동
		String result = "\n\n이름 : %s (%d세, %c)\n";
		
		System.out.printf(result, name, age, gender);
		System.out.println("신장 : " + height + "cm");
		System.out.println("주소 : " + address);
		
		sc.close();
	}
}

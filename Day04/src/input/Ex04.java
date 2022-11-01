package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 문자열은 next()로 입력 가능
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		
		System.out.println("당신의 이름은 " + name + "님 입니다~\n");
		
		// ※ String은 char의 배열 기반으로 만들어진 클래스이고
		//   순서 번호(index)를 가지고 있다
		
		System.out.println("name[0] = " + name.charAt(0));
		
		
		System.out.print("\n성별 입력 : ");
		char gender = sc.next().charAt(0);
		//			  "여성".charAt(0);
		
		System.out.println(name + "님의 성별은 " + gender);
		
		
		sc.close();
		
	}
}

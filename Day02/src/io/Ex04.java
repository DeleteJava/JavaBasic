package io;

public class Ex04 {
	public static void main(String[] args) {
		// 이스케이프 시퀀스(escape sequence)
		// - 문자열 내에서 특수한 형태로 사용되는 문자 집합
		// - \ (백슬래시)와 결합되어서 사용된다

		System.out.println("Hello\nWorld"); // \n : new line. 줄 바꿈

		System.out.println("Hello \t\t World"); // \t : tab. 들여쓰기
		
		System.out.println("\n저희 Java 버전은 '8버전' 입니다~");

		System.out.println("\n저희 Java 버전은 \"8버전\" 입니다~");
		// \" : 문자열 묶는 기능을 제거
		
		System.out.println("저희 공유폴더 주소는 \\\\192.168.0.15 입니다");
		// \\ : 이스케이프 기능을 제거
	}
}

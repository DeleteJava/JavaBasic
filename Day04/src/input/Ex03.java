package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 1. 입력을 수월하게 도와줄 Scanner 선언
		Scanner scan = new Scanner(System.in);
		
		// 2. 입력 받을 변수들을 선언 (String, char 제외)
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		
		// booelan
		System.out.print("boolean? ");
		bo = scan.nextBoolean();			// next자료형() 형태로 사용 가능
		
		System.out.println("bo = " + bo);
		
		// byte
		System.out.print("\nbyte? ");
		by = scan.nextByte();
		
		System.out.println("by = " + by);
		
		
		// short
		System.out.print("\nshort? ");
		sh = scan.nextShort();
		
		System.out.println("sh = " + sh);
		
		
		// int
		System.out.print("\nint? ");
		it = scan.nextInt();
		
		System.out.println("it = " + it);
		
		
		// long
		System.out.print("\nlong? ");
		lo = scan.nextLong();
		
		System.out.println("lo = " + lo);
		
		
		// float
		System.out.print("\nfloat? ");
		fl = scan.nextFloat();
		
		System.out.println("fl = " + fl);
		
		
		// double
		System.out.print("\ndouble? ");
		db = scan.nextDouble();
		
		System.out.println("db = " + db);
		
		
		scan.close();
	}
}

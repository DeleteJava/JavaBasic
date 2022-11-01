package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : 산술 + 대입 연산자
		// 종류 : +=, -=, *=, /=, %=
		
		int n = 10;
		
		System.out.println("n + 10 = " + (n + 10));
		System.out.println("n = " + n + "\n");
		
		
		n += 10; 	// n = n + 10;
		System.out.println("n = " + n);
		
		n -= 3;
		System.out.println("n = " + n);
		
		n *= 2;
		System.out.println("n = " + n);
		
		n /= 3;
		System.out.println("n = " + n);
		
		n %= 7;
		System.out.println("n = " + n + "\n");
		
		
		int a = 2, b = 1, c = 3;
		
		a += b *= c -= 1;
		
		System.out.println("a = " + a);		// 4
		System.out.println("b = " + b);		// 2
		System.out.println("c = " + c);		// 2
		
	}
}
package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자를 1증가 혹은 1감소
		
		int n = 10;
		
		n++;		// 후치 : 연산자가 뒤에 붙은 경우
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		
		++n;		// 전치 : 연산자가 앞에 붙은 경우
		System.out.println("n = " + n);
		
		--n;
		System.out.println("n = " + n + "\n");
		
		
		// 전치와 후치는 기본적으로 차이가 없다
		// 단, 다른 연산과 같이 사용시 차이가 발생
		
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;		// 전치 : 증감 후 다른 연산을 수행
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		
		n1 = 10;		// 같은 값에서 비교를 위해 초기화 시킨다
		
		n3 = n1++;		// 후치 : 다른 연산 후 증감을 수행
		System.out.printf("n1 = %d, n3 = %d\n\n", n1, n3);
		
		
		
		int a = 3, b = 5, c = 7, d;
		
		d = ++a + b-- + c++;
//		d =  4  +  5  +  7;
//		           4     8
		
		System.out.println("a = " + a);		// 4
		System.out.println("b = " + b);		// 4
		System.out.println("c = " + c);		// 8
		System.out.println("d = " + d);		// 16
		
	}
}

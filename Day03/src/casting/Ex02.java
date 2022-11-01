package casting;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(10 / 3);
		System.out.println(10 / 3.0 + "\n");
		
		
		int n1 = 10, n2 = 3;
		
		System.out.println(n1 / n2);
		
		System.out.println(n1 / (double)n2);
		// - 강제 형변환은 영구적일까?
		
		
		System.out.println(n2);
		// 3으로 출력 -> 즉, 일시적으로 변환
	}
}

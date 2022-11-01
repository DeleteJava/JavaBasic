package variable;

/*
 * 	Bit VS Byte
 * 	1. Bit 	: 컴퓨터 데이터의 최소 단위. 2진수로 표현
 * 	2. Byte	: 컴퓨터 파일의 최소 단위. 1byte = 8bit = 2^8 = 256 (0 ~ 255)
 * 
 * 	2의 승수
 * 	승 : 0 1 2 3  4  5  6  7   8   9   10 		16
 * 	값 : 1 2 4 8 16 32 64 128 256 512 1024		65536
 * 
 *	Java의 자료형		타입		크기
 *  ------------------------------
 *	1. boolean		참/거짓	1bit
 *	2. char			문자		2byte
 *	3. byte			정수		1byte
 *	4. short		정수		2byte
 * 	5. int			정수		4byte	-> 정수의 대표 자료형
 * 	6. long			정수 		8byte
 * 	7. float		실수		4byte
 * 	8. double		실수		8byte	-> 실수의 대표 자료형
 * 
 */

public class Ex02 {
	public static void main(String[] args) {
		
		boolean bo = true;		// 거짓은 false
		char ch = 'A';
		byte by = 127;
		short sh = 32767;
		int it = 2000000000;
		
		// 리터럴 : 임시값. 변수에 저장되지 않은 데이터를 의미
		// - 리터럴도 메모리에 임시로 공간이 생성이 되는데, 이를 '상수풀'이라고 한다
		// - 상수풀은 데이터를 '대표 타입'으로 생성해서 임시로 저장한다
		
		long lo = 3000000000L;		// L은 리터럴 공간을 long(8byte)로 잡아 달라~ 는 의미
		float fl = 1.1234567891234F;		// F는 리터럴 공간을 float(4byte)로 잡아 달라~ 는 의미
		
		double db = 1.1234567891234; 
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
		
	}
}

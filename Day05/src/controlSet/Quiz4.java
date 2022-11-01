package controlSet;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// PDF 10p) 3번
		Scanner sc = new Scanner(System.in);
		int station, total;			// 정거장 수, 총 소요 시간
		
		
		System.out.print("정거장 수? ");
		station = sc.nextInt();
		
		total = station * 2;
		
		// 10 정거장 이상이면 x 4로 덮는다
		if (station >= 10) {
			total = station * 4;
		}

		
		// 60분 이상이면 시/분으로 자른다
		if (total >= 60) {
			int hour = total / 60;		// 64 / 60 = 1
			int minute = total % 60;	// 64 % 60 = 4
			
			System.out.printf("총 소요 시간 %d시간 %d분\n", hour, minute);
		}
		else {
			System.out.println("총 소요 시간 " + total + "분");
		}
		
		sc.close();
	}
}

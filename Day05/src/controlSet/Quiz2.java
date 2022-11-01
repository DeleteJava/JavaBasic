package controlSet;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// PDF 9p)
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		int sum;
		double avg;
		char rank;
		
		System.out.print("국 영 수 점수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		if (avg >= 90) 			{ rank = 'A'; }
		else if (avg >= 80) 	{ rank = 'B'; }
		else if (avg >= 70) 	{ rank = 'C'; }
		else if (avg >= 60) 	{ rank = 'D'; }
		else 				 	{ rank = 'F'; }
		
		System.out.println("평균 : " + avg);
		System.out.println(rank + "등급입니다~~");
		sc.close();
	}
}

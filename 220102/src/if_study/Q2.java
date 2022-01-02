package if_study;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 시험점수를 입력받아 
		 * 90~100점은 A
		 * 80~89점은 B
		 * 70~79점은 C
		 * 60~69점은 D
		 * 나머지 점수는 F출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		String result =  "";
		if(score>=90 && score<=100) {
			result = "A";
		} else if(score>=80) {
			result = "B";
		} else if(score>=70) {
			result = "C";
		} else if(score>=60) {
			result = "D";
		} else if(score>=0) {
			result = "F";
		}
		System.out.println(result);
				
	}

}

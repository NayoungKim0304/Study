package if_study;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] arg) {

	/*
	 * 두 정수 A와 B가 주어졌을때, A와 B를 비교하는 프로그램 작성
	 * 문제출처-https://www.acmicpc.net/problem/1330
	 */
	
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	if(A > B) {
		System.out.println(">");
	}else if(A < B) {
		System.out.println("<");
	}else {
		System.out.println("==");
	}
	
}
}

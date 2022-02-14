package Feb;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {

		//백준 11720번(https://www.acmicpc.net/problem/11720)
		///첫줄에 숫자의 개수, 둘째줄에 숫자N개가 주어진다
		//숫자 N개의 합 출력
		
		Scanner sc = new Scanner(System.in);
		
		//첫줄 숫자 개수 입력받기
		int n = sc.nextInt();
		//둘째줄 숫자N개 입력받기->문자열로
		String s = sc.next();
				
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += s.charAt(i)-48;
			//charAt은 문자의 아스키코드값을 반환한다. 문자 0에 대한 아스키코드값이 48이므로 -48을 해주어야 정수를 얻을 수 있음
		}
		
		System.out.println(sum);
	}

}

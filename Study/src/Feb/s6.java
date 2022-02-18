package Feb;

import java.util.Scanner;

public class s6 {

	public static void main(String[] args) {
		
		//백준 2675번(https://www.acmicpc.net/problem/2675)
		//문자열 S를 입력받은 후 각 문자를 R번 반복해 새 문자열 P를 만드는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 개수n
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			//반복횟수 입력
			int R = sc.nextInt();
			//문자열 입력
			String S = sc.next();
			
			
			for(int j=0; j<S.length(); j++) {
				//문자열 S의 한 문자를 R번 반복
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
		}
		
		
	}

}

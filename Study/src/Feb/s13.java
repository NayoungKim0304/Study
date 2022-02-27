package Feb;

import java.util.Scanner;

public class s13 {

	public static void main(String[] args) {

		//백준 10872번(https://www.acmicpc.net/problem/10872)
		//팩토리얼 구하기
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int a = 1;
		for(int i=1; i<=N; i++) {
			a *= i;
		}
		
		System.out.println(a);
	}

}

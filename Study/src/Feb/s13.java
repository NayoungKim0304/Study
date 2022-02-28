package Feb;

import java.util.Scanner;

public class s13 {

	public static void main(String[] args) {

//		//백준 10872번(https://www.acmicpc.net/problem/10872)
//		//팩토리얼 구하기
//		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		
//		int a = 1;
//		for(int i=1; i<=N; i++) {
//			a *= i;
//		}
//		
//		System.out.println(a);
		
		//----재귀함수 이용
		System.out.println(fac(N));
	}

	
	//재귀함수 이용해보기
	//리턴값 있음(int) 매개변수 있음(N)
	public static int fac(int N) {
		//N이 1일때 리턴값은 1
		if(N ==1) {
			return 1;
		} else {
			//N이 2이상일때 N과 N-1까지 팩토리얼 한 값으르 리턴
			return N*fac(N-1);
		}
		
		
	}
}

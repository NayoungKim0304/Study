package Mar;

import java.util.Scanner;

public class s10 {

	public static void main(String[] args) {

		//백준 1065번(https://www.acmicpc.net/problem/1065)
		//어떤 양의 정수 X의 각 자리가 등차수열을 이루면 그 수를 한수라고 한다
		//N이 주어졌을때 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		//N은 1000보다 작거나 같은 자연수
		int N = sc.nextInt();
		
		//한수의 개수 count
		int count = 0;
		
		//N이 1자리, 2자리 수일때 모두 한수가 됨
		if(N < 100) {
			count = N;
			System.out.println(count);
		} else {
			//N이 100부터인 경우로 이미 한수의 개수 99개 존재
			count = 99;
			if(N == 1000) {
				//N이 최대 1000일때, 1000은 한수가 아니므로 N=999와 결과가 같음
				N=999;
			}
			
			for(int i=100; i<=N; i++) {
				//백의 자리 숫자
				int a  = i / 100;
				//10의 자리 숫자
				int b = (i / 10) % 10;
				//1의 자리 숫자
				int c = i % 10;
				
				if((a-b) == (b-c)) {
					count++;
				}
			}
				System.out.println(count);
		}
		
		
		
	}

}

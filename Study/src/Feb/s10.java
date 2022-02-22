package Feb;

import java.util.Scanner;

public class s10 {

	public static void main(String[] args) {

		//백준 11653번(https://www.acmicpc.net/problem/11653)
		//정수 N이 주어졌을때 소인수 분해하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//가장 작은 소수인 2부터 나누기 시작하여 더이상 2로 나누어 지지 않으면
		//다음 소수인 3으로 나누는 방식으로 작성한다.
		//더이상 나누어지지 않을때까지 반복한다.
		
		int i = 2;
		
		while(N >= i) {
			if(N%i == 0) {
				System.out.println(i);
				N /= i;
			}else {
				i++;
			}
		}
	}

}

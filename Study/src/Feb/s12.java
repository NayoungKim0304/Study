package Feb;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class s12 {

	public static void main(String[] args) {

		//백준 10870번(https://www.acmicpc.net/problem/10870)
		//피보나치수
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//a[0] (0번째) 부터 시작하기 때문에 배열 a의 크기는 n+1이 된다.
		int[] a = new int[n+1];
		
		//a[0]은 0, a[1]은 1로 정해져 있으므로 각자 초기화시켜주고
		//a[2]부터 앞 두 수를 합한 값으로 if문 작성
		for(int i=0; i<n+1; i++) {
			if(i==0) {
				a[0] = 0;
			}else if(i==1) {
				a[1] = 1;
			}else {
				a[i] = a[i-1] + a[i-2];
			}
			
		}
		
		System.out.println(a[n]);
		
	}
}

package Mar;

import java.util.Scanner;

public class s4 {

	public static void main(String[] args) {

		//백준 2798번(https://www.acmicpc.net/problem/2798)
		//양의 정수가 쓰여있는 각 카드가 있다.
		//딜러가 N장의 카드를 바닥에 놓고, 숫자 M을 외친다
		//N장의 카드 중에서 3장의 카드를 골라 그 합이 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다
		//카드 3장의 합을 구해 출력
		//첫줄에 카드개수N, 합M, 둘째줄에 카드에 쓰여있는 수가 주어짐
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[]arr = new int[N];
		for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
		
		int result = 0;
		
		//세 수를 선택해야 하므로 i는 N의 개수에서 2개를 뺀 만큼 범위에서 구함
		for(int i=0; i<N-2; i++) {
			//위와 마찬각지 논리로 j는 N-1 범위 안, j는 i다음수부터
			for(int j=i+1; j<N-1; j++) {
				//k는 N까지, k는 j 다음수부터
				for(int k=j+1; k<N; k++) {
					//세 숫자를 더함
					int sum = arr[i]+arr[j]+arr[k];
					
					//더한 값이 M과 같을 때 or 결과값은보다 크고 M보다 작을때 result값은 sum이 됨
					if(sum==M || (sum>result && M>sum)) {
						result = sum;
					}
					
				}
			}
			
		}
		System.out.println(result);
		
		
	}

}

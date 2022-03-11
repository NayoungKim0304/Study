package Mar;

import java.util.Scanner;

public class s9 {

	public static void main(String[] args) {

		//백준 10871번(https://www.acmicpc.net/problem/10871)
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램
		
		//첫째줄에 N과 X가 주어짐
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		//둘째줄에 수열 A를 이루는 정수 N개
		//입력받은 정수를 배열에 저장
		int [] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
			//입력받은 수가 X보다 작다면 출력한다
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}

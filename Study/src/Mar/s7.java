package Mar;

import java.util.Arrays;
import java.util.Scanner;

public class s7 {

	public static void main(String[] args) {

		//백준 1546번(https://www.acmicpc.net/problem/1546)
		//자기 점수 중에 최댓값(M)을 골라 모든 점수를 점수/M*100으로 고친다
		//위처럼 계산했을때 새로운 평균을 구한느 프로그램
		//첫째줄에 과목의 개수 N, 둘째줄에 현재성적이 주어짐
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//10의 -2승까지 오차가 계산되므로 int가 아닌 double로
		double [] arr = new double[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		//배열 오름차순 정렬
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			//배열을 오름차순으로 정렬했으므로 최대값은 arr[N-1]
			sum += ((arr[i]/arr[N-1])*100);
		}
		
		System.out.println(sum/N);
		
		
		
	}

}

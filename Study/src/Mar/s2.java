package Mar;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {

		//백준 7568번(https://www.acmicpc.net/problem/7568)
		//덩치 등수 구하기
		//몸무게x, 키y ->(x,y) 로 표시할때
		//x,y 모두 상대방보다 클 때 덩치가 큰 셈
		//자신보다 덩치 큰 사람이 k명이면 그 사람의 덩치 등수는 k+1
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//사람에 따른 몸무게, 키, 등수를 나타내는 2차원 배열 생성
		int [][] arr = new int[N][3];
		
		for(int i=0; i<N; i++) {
			//몸무게와 키 입력받음
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();			
		}
		
		//k 선언
		int k;
		for(int i=0; i<N; i++) {
			k=0;
			//한 사람의 몸무게와 키가 모두 적을때, k를 1 증가시켜준다
			for(int j=0; j<N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					k++;
				}
			}
			//등수는 k+1
			arr[i][2] = k+1;
					
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i][2] + " ");
		}

	
	}

}

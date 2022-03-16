package Mar;

import java.util.Scanner;

public class s13 {

	public static void main(String[] args) {
		
		//백준 4344번(https://www.acmicpc.net/problem/4344)
		//첫째 줄에는 테스트 케이스의 개수 C가 ㅈ ㅜ어짐
		//둘째줄부터 각 테스트 케이스마다 학생의 수 N이 첫 수로 주어지고
		//이어서 N명의 점수가 주어짐
		//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째자리까지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		int[]arr;
		
		for(int i=0; i<C; i++) {
			
			int N = sc.nextInt();
			arr = new int[N];
			
			double sum = 0;
			
			for(int j=0; j<N; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double avg = (sum/N);
			double count = 0;
			
			for(int k=0; k<N; k++) {
				if(arr[k] > avg) {
					count++;
				}
			}
			
			System.out.println((count/N)*100);
		}
	}

}


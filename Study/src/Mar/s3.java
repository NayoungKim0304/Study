package Mar;

import java.util.Scanner;

public class s3 {

	public static void main(String[] args) {

		//백준 2231번(https://www.acmicpc.net/problem/2231)
		//어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미
		//어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다
		//예를 들어 245의 분해합은 256(=245+2+4+5), 여기서 생성자는 245
		//N의 가장 작은 생성자를 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//생성자 선언, 초기화
		int a = 0;
		
		for(int i=0; i<N; i++) {
			
			int num = i;
			
			//각 자리 '숫자'의 합 선언, 초기화
			int sum = 0;
			
			while(num != 0) {
				//각 자리의 숫자는 10으로 나눈 나머지로 가장 작은 자리수의 숫자부터 차례대로 구할 수 있음
				sum += num % 10;
				
				//그 후 10으로 나눈 몫을 구하여 그 다음 자리수의 숫자를 구함 
				num = num / 10;
			}
			
			
			if(sum+i==N) {
				//가장 작은 생성자
				a = i;
				break;
			}
		}
		
		System.out.println(a);
	}

}

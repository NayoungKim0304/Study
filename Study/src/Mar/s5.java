package Mar;

import java.util.Scanner;

public class s5 {

	public static void main(String[] args) {

		//백준 1436번(https://www.acmicpc.net/problem/1436)
		//종말의 숫자란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수를 말함
		//제일 작은 종말의 숫자는 666이고 1666, 2666,,, 순서
		//이 숫자를 넣어 영화제목을 지을때 N번째 영화의 제목은 'N번째로 작은 종말의 숫자'이다
		//N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램
		
		//숫자 N이 주어짐
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int num=666;
		int count=1;
		
		//count의 수가 N과 같아지면 반복문 빠져나옴
		while(count != N) {
			num++;
			//int형을 String으로 바꾸는 방법은
			//Integer.toString()이용
			if(Integer.toString(num).contains("666")) {
				count++;
			}
			
		}
		System.out.println(num);
	}

}

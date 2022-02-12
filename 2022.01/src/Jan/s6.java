package Jan;
import java.util.Scanner;

public class s6 {

	public static void main(String[] args) {

		//백준 8958번(https://www.acmicpc.net/problem/8958)
		//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
		//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		//퀴즈 결과의 개수 입력
		int n = sc.nextInt();
		
		//각 결과를 담는 배열 생성
		String[] arr = new String[n];
		
		//배열의 인자를 입력받음
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		
		
		
		for(int i=0; i<arr.length; i++) {
			//count = O가 연속된 횟수
			//score = 최종점수
			int count = 0;
			int score = 0;
			
			//배열인자를 판별
			for(int j=0; j<arr[i].length(); j++) {
				//charAt : 문자열에서 한글자를 char형으로 변환해주는 함수!!
				if(arr[i].charAt(j)=='O') {
					count++;
				} else {
					count = 0;
				}
				score += count;
			}
			
			System.out.println(score);
			
		}
		
		
	}

}

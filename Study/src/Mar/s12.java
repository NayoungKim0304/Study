package Mar;

import java.util.Arrays;
import java.util.Scanner;

public class s12 {

	public static void main(String[] args) {

		//백준 11651번(https://www.acmicpc.net/problem/11651)
		//2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, 
		//y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//2차원 배열 생성, x/y좌표를 나타내기 위해 [N][2]
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			//x좌표
			arr[i][0] = sc.nextInt();
			//y좌표
			arr[i][1] = sc.nextInt();
		}

		//람다식 사용
		Arrays.sort(arr, (a1, a2) ->{
			if(a1[1] == a2[1]) {
				return Integer.compare(a1[0], a2[0]);
			} else {
				return Integer.compare(a1[1], a2[1]);
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
	}

}

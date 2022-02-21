package Feb;

import java.util.Scanner;

public class s9 {

	public static void main(String[] args) {
		
		//백준 1085번(https://www.acmicpc.net/problem/1085)
		//직사각형의 좌표가 주어졌을 때, 내부의 한 점에서 직사각형의 경계까지 최소거리 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//x,y = 직사각형 내부의 점 좌표
		//w,h = 오른쪽 위 꼭지점 좌표
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//직사각형 내부의 점 (x,y)에서 네 변까지의 거리는 각각
		//x,y,w-x,h-y 이다.
		//네개의 값을 비교해 최소값을 구하면 된다.
		
		//삼항연산자를 사용하여
			
					
			int min=(((x < y) ? x : y) < w-x ? ((x < y) ? x : y) : w-x) < h-y ? (((x < y) ? x : y) < w-x ? ((x < y) ? x : y) : w-x) : h-y;
			System.out.println(min);
		
		
		
	}

}

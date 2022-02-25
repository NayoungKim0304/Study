package Feb;

import java.util.Scanner;

public class s11 {

	public static void main(String[] args) {

		//백준 3009번(https://www.acmicpc.net/problem/3009)
		//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해 필요한 네번째점을 찾는 프로그램
		//세 점의 좌표가 한 줄에 하나씩 주어짐
		
		Scanner sc = new Scanner(System.in);
		
		//세 점을 배열로 입력받음
		int[] a = {sc.nextInt(), sc.nextInt()};
		int[] b = {sc.nextInt(), sc.nextInt()};
		int[] c = {sc.nextInt(), sc.nextInt()};
		
		//직사각형의 세 점을 알게 되면 그 중 두 점은 x좌표, y좌표가 각각 같다
		//따라서 같지 않은 하나의 값이 구하는 좌표의 값이 된다.
		
		int x;
		int y;
		
		//x좌표 구하기
		if(a[0] == b[0]) {
			x=c[0];
		}else if(a[0] == c[0]) {
			x=b[0];
		}else {
			x=a[0];
		}
		
		//y좌표 구하기
		if(a[1] == b[1]) {
			y=c[1];
		}else if(a[1] == c[1]) {
			y=b[1];
		}else {
			y=a[1];
		}
		
		System.out.println(x + " " + y);
		
		
		
	}
}

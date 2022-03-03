package Mar;

import java.util.Scanner;

public class s1 {

	public static void main(String[] args) {

		//백준 2869번(https://www.acmicpc.net/problem/2869)
		//달팽이는 높이가 V미터인 나무 막대를 올라감
		//낮에 A미터를 올라가고 밤에 자는동안 B미터 미끄러짐
		//달팽이가 나무막대를 모두 올라가려면 며칠이 걸리는지 구하는 프로그램
		//첫째줄에 A,B,V 입력
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		//하루동안(낮-밤) 움직이는 거리 A-B
		
		//정상거리에서 내려가는 b값을 빼주고 계산해야 최대 하루 도달거리가 나옴
		int a = (V-B)/(A-B);
		if((V-B)%(A-B) !=0) {
			//그러나 나머지가 남게되면 하루를 더 움직여야함
			a++;
		}
		
		System.out.println(a);
	}

}

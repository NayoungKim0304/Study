package Feb;

import java.util.Scanner;

public class s3 {

	public static void main(String[] args) {

		//백준 1712번(https://www.acmicpc.net/problem/1712)
		//매년 임대료, 재산세, 보험료, 급여 등 고정비용 : A만원
		//노트북을 생산하는 데 재료비, 인건비 등 가변비용 : B만원
		//노트북 가격 : C만원
		//손익분기점 : (판매비용 >= 고정비용+가변비용)을 구하는 프로그램 작성
		//첫째 줄에 A,B,C가 빈 칸을 사이에 두고 순서대로 주어짐
		//->최초로 이익이 발생하는 판매량 출력. 손익분기점이 존재하지 않으면 -1 출력
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//판매량을 n이라고 두었을때
		//고정비용 = A, 가변비용 = B*n, 판매비용 = C*n
		//C*n = A + B*n -> n = A/(C-B) 로 계산할 수 있음
		//이때 n은 손익이 0이 되는 판매량이고, 따라서 이익이 나는 손익분기점은 n=A/(C-B) +1이 되는 지점
		
		if(C-B <= 0) {
			//분모 C-B값이 음수면 n(양수인 정수)값이 존재하지 않게 되고, 0이면 나눗셈이 실행되지 못함
			System.out.println(-1);
		}else {
			System.out.println((A/(C-B))+1);
		}
		
		
	}
	


}

package Mar;

import java.util.Scanner;
import java.util.StringTokenizer;

public class s11 {

	public static void main(String[] args) {
		
		//백준 1152번(https://www.acmicpc.net/problem/1152)
		//영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 몇개의 단어가 있는지 구하시오
		//단어는 공백 한개로 구분된다
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		//한 문자를 기준으로 구역을 나누어 주는 식 작성
		//StringTokenizer 클래스 이용
		
		StringTokenizer st = new StringTokenizer(S, " ");
		
		//토큰개수구하기
		System.out.println(st.countTokens());
		
	}

}

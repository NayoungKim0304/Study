package Feb;

import java.util.Scanner;

public class s1 {

	public static void main(String[] args) {
		
		
		//백준 10809번(https://www.acmicpc.net/problem/10809)
		//알파벳으로 이루어진 단어가 주어졌을때, 각 알파벳에 대해서 단어에 포함되어 있으면 처음 등장하는 위치,
		//포함되어 있지 않으면 -1을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		//입력받는 문자열
		String result = sc.next();
		
		//알파벳 26자의 위치를 가리킬 배열 생성(배열크기 26)
		int[] arr = new int[26];
		
		//배열의 모든 원소를 -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		//charAt() 메서드를 이용하여 입력받은 문자열 result의 알파벳을 구한다
		for(int i=0; i<result.length(); i++) {
			char ch = result.charAt(i);
			
			//문자 a의 아스키코드값은 97이므로
			//알파벳에서 97을 빼게 되면 몇번째인지 구할 수 있음 -> a : 0번째, b : 1번째
			if(arr[ch-97] == -1) {
				//인덱스 ch-97번째 자리가 -1로 되어있다면
				//i값으로 초기화 시켜준다(i번째 값이라는 뜻)
				arr[ch-97] = i;
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

package Mar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class s8 {

	public static void main(String[] args) {

		//백준 1427번(https://www.acmicpc.net/problem/1427)
		//배열 정렬 문제
		//수가 입력되면 각 자리수를 내림차순으로 정렬해보기
		
		Scanner sc = new Scanner(System.in);

		//배열 값을 내림차순응로 정리하는 메서드
		//Arrays.sort(배열명, Collections.reverseOrder())
		//이 함수의 경우 int 등 기본타입배열일때는 적용이 불가능하다
		//따라서 숫자를 문자열 형식으로 입력받고 Integer형의 배열을 생성
		
		String s = sc.nextLine();
		Integer[] arr = new Integer[s.length()];
		
		//문자열의 각 자리를 정수형배열에 넣어줌
		for(int i=0; i<s.length(); i++) {
			//문자의 아스키코드값으로 변환되기 때문에 -'0' 또는 -48을 해주어 정수형으로 변환
			arr[i] = s.charAt(i)-'0';
			
			}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

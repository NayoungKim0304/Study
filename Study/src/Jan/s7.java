package Jan;
import java.util.Scanner;

public class s7 {

	public static void main(String[] arg) {
		
		//백준 11654번(https://www.acmicpc.net/problem/11654)
		//알파벳 소문자, 대문자, 숫자 0-9 중 하나가 주어졌을 때,
		//주어진 글자의 아스킈 코드값을 출력하는 프로그램
	
		Scanner sc = new Scanner(System.in);
		
		//숫자나 문자를 입력받아야 하기 때문에 이를 모두 포함하는 String 변수로 받음
		String a = sc.next();
		
		//아스키코드는 정수로 이루어진 코드로 A는 65, 숫자 0은 48로 표기됨
		//아스키코드는 정수이기 때문에 String->int로 변환하면 구할 수 있음
		int result = a.charAt(0);
		
		System.out.println(result);
				
	}

}

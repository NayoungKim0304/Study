package Feb;

import java.math.BigInteger;
import java.util.Scanner;

public class s15 {

	public static void main(String[] args) {

		//백준 10757번(https://www.acmicpc.net/problem/10757)
		//두 정수 A와 B를 입력받은 다음, A+B출력
		
		Scanner sc = new Scanner(System.in);

		
		//0 < A,B < 10의 10000제곱 조건이므로 
		//A,B는 long의 범위 내에서도 계산되지 않는 경우가 있음
		
		//BigInteger라는 java.math 패키지의 클래스를 이용
		//BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한
		
		//문자열 형태기 때문에 문자열로 초기화시켜줌
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());

		//BigInteger은 문자열이기 때문에 사칙연산이 안됨
		//내부의 덧셈 메서드 사용
		BigInteger C = A.add(B);
		System.out.println(C);
	}

}

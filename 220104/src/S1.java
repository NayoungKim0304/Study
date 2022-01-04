import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {

		//백준 2475번
		//예를들어 처음 5자리 숫자가 04256이면 각 숫자를 제곱한 수들의 합 81을 
		//10으로 나눈 나머지 1이 검증수이다.
		//검증수 출력하기
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		a= sc.nextInt();
		b= sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		int g = ((a*a)+(b*b)+(c*c)+(d*d)+(e*e)) % 10;
		
		System.out.println(g);
		
		
		
		
		
	}

}

package Feb;

import java.util.Scanner;

public class s5 {

	public static void main(String[] args) {

		//백준 2908번
		//수를 다른 사람과 거꾸로 읽는다. 743과 893이 있다면 437과 398로 읽어
		// 두 수중 큰 수를 437이라고 말할 것이다.
		// 세자리 두 수가 주어졌을때 대답을 출력
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//숫자 거꾸로 읽기
		//100의자리->1의자리가 되므로 숫자를 100으로 나눈 몫이 1의자리숫자
		//10의자리->10의자리이므로 숫자를 100으로 나눈 나머지를 10으로 나눈 몫이 10의자리숫자
		//1의자리->100의자리이므로 숫자를 10으로 나눈 나머지가 100의자리숫자
		int aa = (a/100) + ((a%100)/10)*10 + (a%10)*100;				
		int bb = (b/100) + ((b%100)/10)*10 + (b%10)*100;	
		
		System.out.println(Math.max(aa, bb));
	}

}

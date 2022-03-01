package Feb;

import java.util.Scanner;

public class s14 {

	public static void main(String[] args) {

		//백준 4153번(https://www.acmicpc.net/problem/4153)
		//삼각형의 각 변의 길이가 주어졌을때 직각삼각형인지 판별
		
		Scanner sc = new Scanner(System.in);
	
		
		//반복해서 입력받고, 
			while(true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				
				if(a==0 && b==0 && c==0) {
					//0 0 0을 마지막에 입력받으면 반복문 빠져나감
					break;
				}else if(a*a == b*b + c*c) {
					System.out.println("right");
				}else if(b*b == a*a + c*c) {
					System.out.println("right");
				}else if(c*c == a*a + b*b) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}				
			}

		
			
	
		
		
	}

}

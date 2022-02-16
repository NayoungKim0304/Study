package Feb;

import java.util.Scanner;

public class s4 {

	public static void main(String[] args) {

		//백준 2839번(https://www.acmicpc.net/problem/2839)
		//3kg와 5kg 설탕봉지가 있을 때, 최대한 적은 봉지를 들고 배달하려고 함.
		//예를들어 18kg을 배달해야 할때 3kg 6봉지 대신, 5kg 3봉지와 3kg 1봉지로 배달
		//설탕을 Nkg 배달해야 할 때 봉지 몇개를 가져가면 되는지 구하는 프로그램
		//정확하게 N을 만들 수 없으면 -1 출력
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//간단한 수학문제이므로 몇번만 반복해보면 규칙성을 알 수 있다.
		//3kg -> 5로 나눈 몫=0, 나머지=3 / 3kg : 1, 5kg : 0, 총 1봉지 
		//4kg -> 5로 나눈 몫=0, 나머지=4 / 3kg : 0, 5kg : 0, -1 
		//5kg -> 5로 나눈 몫=1, 나머지=0 / 3kg : 0, 5kg : 1, 총 1봉지 
		//6kg -> 5로 나눈 몫=1, 나머지=1 / 3kg : 2, 5kg : 0, 총 2봉지 
		//7kg -> 5로 나눈 몫=1, 나머지=2 / 3kg : 0, 5kg : 0, -1 
		//8kg -> 5로 나눈 몫=1, 나머지=3 / 3kg : 1, 5kg : 1, 총 2봉지
		//9kg -> 5로 나눈 몫=1, 나머지=4 / 3kg : 3, 5kg : 0, 총 3봉지
		//10kg -> 5로 나눈 몫=2, 나머지=0 / 3kg : 0, 5kg : 2, 총 2봉지
		//11kg -> 5로 나눈 몫=2, 나머지=1 / 3kg : 2, 5kg : 1, 총 3봉지
		//==>5로 나눈 나머지가 0~4반복(4kg, 7kg 제외)
		
		//나머지가 0일때 : 5로 나눈 몫
		//나머지가 1일때 : 5로 나눈 몫 +1
		//나머지가 2일때 : 5로 나눈 몫 +2
		
		if(N==4 || N==7) {
			System.out.println(-1);
		}else if(N%5==0) {
			System.out.println(N/5);
		}else if(N%5==1) {
			System.out.println((N/5)+1);
		}else if(N%5==2) {
			System.out.println((N/5)+2);
		}else if(N%5==3) {
			System.out.println((N/5)+3);
		}else {
			System.out.println((N/4)+4);
		}
		
		
		//다른 방법으로 생각
		//봉지 수 count
		//N이 5의 배수이면 count=N/5
		//5의 배수가 아닐 경우 3을 5의 배수가 될때까지 빼줌(3kg봉지수 1개 추가)
		//N이 4와 7인 경우에만 01
		int count=0;
		
		while(true) {
			if(N%5 == 0) {
				count += N/5;
				System.out.println(count);
				return;
			}else if(N==4 || N==7) {
				System.out.println(-1);
			}else {
				N -= 3;
				count++;
			}
				
		}
		

	}
}

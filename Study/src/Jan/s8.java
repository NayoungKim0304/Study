package Jan;
import java.util.Scanner;

public class s8 {

	public static void main(String[] args) {

		//백준 10952번(https://www.acmicpc.net/problem/10952)
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 작성
		//입력의 마지막에는 0이 들어옴
		
		Scanner sc = new Scanner(System.in);
		
		//횟수가 정해져있지 않은 반복문이므로 while을 사용함
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//마지막 입력 0 0 이 되면 입력을 종료하고, 조건문을 빠져나간다
			if(a==0 && b==0) {
				sc.close();
				break;
			}
			
			System.out.println(a+b);
					
		}
	}

}

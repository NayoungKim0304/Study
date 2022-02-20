package Feb;

import java.util.Scanner;

public class s8 {

	public static void main(String[] args) {

		//백준 1978번(https://www.acmicpc.net/problem/1978)
		//주어진 N개 숫자 중 소수가 몇개인지 찾아 출력
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//소수의 개수 count
		int count = 0;
		
		boolean tf = false;
		
		//소수 : 1과 자기 자신 말고 약수가 없는 수
		// => 1부터 입력한 수까지 나누었을 때 나누어 떨어지는 수가 있다면 소수가 아님
		for(int i=0; i<N; i++) {
			
			int a = sc.nextInt();
			
			if(a == 1) {
				//1은 소수가 아니므로 count에 들어가지 않음->조건문 빠져나감
				continue;
			} else if(a == 2) {
				//2는 소수지만 2로 나누어 떨어지기 때문에 조건문을 따로 빼줌
				tf=true;
			} else {
				for(int j=2; j<a; j++) {
					//다시 false로 초기화
					tf=false;
					if(a%j==0){
						//소수가 아니므로 반복문 빠져나감
						break;
					} else {
						tf=true;
					}
				}
			}
			
			if(tf==true) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}

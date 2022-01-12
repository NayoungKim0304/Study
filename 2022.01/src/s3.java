import java.util.Scanner;

public class s3 {

	public static void main(String[] args) {

		//백준 2562번(https://www.acmicpc.net/problem/2562)
		// 9개의 서로 다른 자연수가 주어질때 최대값을 찾고
		// 최대값이 몇번째 수인지 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
				
		}
		
		int max = 0;
		int index=0;
		
		for(int i=0; i<a.length; i++) {
		
			//max > a[i] 의 조건이 존재하지 않아도 되는 이유는?
			//max를 0으로 초기화했고, 주어지는 수는 자연수이기 때문에 성립하지 않는 조건이라서?
			
			if(max < a[i]) {
				max = a[i];
				index = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(index);
	}

}

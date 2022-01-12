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
		
			if(max > a[i]) {
				max = max;
				index=i;
			}else {
				max = a[i];
				index = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(index);
	}

}

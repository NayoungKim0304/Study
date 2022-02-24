package Jan1;
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
		
		int max = a[0];
		int index=0;
		
		for(int i=0; i<a.length; i++) {
		
			//max > a[i] 의 조건이 존재하지 않아도 되는 이유는?
			//->최대값을 구하는 것이므로 a[i]가 max값보다 작다면 이전 max값이 그대로 남아있으니까
			//하는 의미가 없음
			//index는 max < a[i] 일때만 i+1번째로 변경되므로
			
			if(max > a[i]) {
					max = max;
				}
			else{
				max = a[i];
				index = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(index);
	}

}

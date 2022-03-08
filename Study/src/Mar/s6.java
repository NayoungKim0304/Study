package Mar;

import java.util.Scanner;

public class s6 {

	public static void main(String[] args) {

		//백준 2750번
		//N개의 수가 주어졌을 때, 오름차순으로 정렬하는 프로그램 작성
		//첫째줄에 수의 개수 N, 둘째줄부터 N개의 줄에 수가 주어짐
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//입력받은 수를 배열에 넣는다고 생각
		int [] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<N-1; i++) {
			//a[i] 다음 수부터 비교하므로 j=i+1부터
			for(int j=i+1; j<N; j++) {
				//arr[i]의 값이 arr[j]값보다 크면
				if(arr[i]>arr[j]) {
					//최소값 min이 arr[j]가 되고
					int min=arr[j];
					//이 값을 다시 arr[i]에 대입
					arr[j]=arr[i];
					//arr[i] 값이 최소값이 됨
					arr[i]=min;
				}
			}
			
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

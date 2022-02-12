package Jan;
import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {

		//백준 10818번 (https://www.acmicpc.net/problem/10818)
		//N개의 정수가 주어지면 최대값 최소값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		//정수 입력받기
		int N = sc.nextInt();
		
		//입력받은 정수의 개수크기만큼 배열만들기
		int[] arr = new int[N];
		
		//배열에 들어갈 정수 입력받기
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//최대값max, 최소값min으로 정의하고 임의의 수로 초기화
		int max = arr[0];
		int min = arr[0];
		
		//최대값 찾기
		for(int i=0; i<arr.length; i++) {
			if(max  >= arr[i]) {
				max = max;
			}else {
				max = arr[i];
			}
		}
		
		//최소값 찾기
		for(int i=0; i<arr.length; i++) {
			if(min <= arr[i]) {
				min = min;
			}else {
				min = arr[i];
			}
		}
		
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);
		
	}

}

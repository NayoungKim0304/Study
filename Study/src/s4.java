import java.util.Scanner;

public class s4 {

	public static void main(String[] args) {

		//백준 2577번(https://www.acmicpc.net/problem/2577)
		//세 자연수 A,B,C가 주어질때 AXBXC를 계산한 결과에
		//0부터 9까지 각각 몇번씩 쓰였는지 구하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//0부터 9까지 숫자의 개수를 담는 크기 10의 배열 생성
		
		int[] arr = new int[10];
		int result = A*B*C;
		
		//마지막 자리의 수는 result를 10으로 나누었을때 나머지가 된다.
		//그 다음 10으로 나눈 몫으로 다시 반복하면 각 숫자의 개수를 구할 수 있다.
		//arr[0]은 result를 10으로 나눈 나머지가 0이 될때 카운트를 올린다고 생각하면
		while(result > 0) {
			arr[result%10]++;
			result = result / 10;
		}
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

package Jan1;
import java.util.Scanner;

public class s5 {

	public static void main(String[] args) {

		//백준 3052번(https://www.acmicpc.net/problem/3052)
		//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
		//그 다음 서로 다른 값이 몇개 있는지 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);

		//입력받은 수들을 42로 나눈 나머지를 배열로 저장
		int[] arr = new int[10];
				
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		//서로 다른 값이 몇개 있는지 출력
		
		int count1 = 0;
		for(int i=0; i<10; i++){
			int count = 0;
			for(int j=i+1; j<10; j++) {
				//a[0]부터 a[9]까지 순차적으로 비교하고 같은값이면 count를 +1해 준다.
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			//같은 값이 없을경우(count==0인 경우)에만 count1을 +1해서 서로 다른 값의 개수를 구한다
			if(count==0) {
				count1++;
			}
			
		}
		System.out.println(count1);
		
		
	}

}

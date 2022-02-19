package Feb;

import java.util.Scanner;

public class s7 {

	public static void main(String[] args) {

		//백준 10250번(https://www.acmicpc.net/problem/10250)
		
		//한줄에 H만큼 사람수가 들어가므로
		//N을 H로 나눈 몫과 나머지로 생각해 볼 수 있다
		//N을 H로 나눈 나머지가 0일때, 층수는 H층이 되고 호수는 몫이 됨
		//N을 H로 나는 나머지가 0이 아닐때, 층수는 나머지가 되고 호수는 나눈 몫+1이 됨
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N%H == 0) {
				System.out.println((H*100)+(N/H));
			}else {
				System.out.println((N%H)*100+((N/H)+1));
			}
		}
	}

}

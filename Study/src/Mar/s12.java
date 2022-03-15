package Mar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class s12 {

	public static void main(String[] args) {

		//백준 11651번(https://www.acmicpc.net/problem/11651)
		//2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, 
		//y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//2차원 배열 생성, x/y좌표를 나타내기 위해 [N][2]
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			//x좌표
			arr[i][0] = sc.nextInt();
			//y좌표
			arr[i][1] = sc.nextInt();
		}

		//람다식 사용
		Arrays.sort(arr, (a1, a2) ->{
			if(a1[1] == a2[1]) {
				return Integer.compare(a1[0], a2[0]);
			} else {
				return Integer.compare(a1[1], a2[1]);
			}
		});
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
		
		//람다식? -> 함수형 프로그래밍을 받아들인 결과(기능 위주의 프로그래밍 기법, 함수가 따로 존재)
		//기본 문법 : (데이터타입 매개변수, ...) -> { 실행문, ... }
		
		//자바에서 정렬 기능을 만드려면 compare 메서드를 사용하여 객체를 Arrays.sort()에 전달한다
		
		//예시
		String[] str = {"this", "is", "java", "world"};
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// -1을 곱해서 내림차순으로 정렬한다.
				return o1.compareTo(o2) * -1;
			}
			
		});
		
		//* - 결국 정렬을 위해 필요했던 '기능'은 Comparator가 아니라 사실 compare()
		//이러한 번거로움을 없애기 위해 람다식 등장
		Arrays.sort(str, (o1, o2) -> { return o1.compareTo(o2) * -1; });
		Arrays.sort(str, (o1, o2) -> o1.compareTo(o2) * -1);
		
		
	
	}

}


public class exam {

	public static void main(String[] arg) {
		//시험 연습
		
		/*
		 * for문을 사용하여 구구단 2~9단 까지 모두 출력
		 * 
		 */
		
		for(int i = 2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}


		/*
		 * 구구단의 특정 단 출력
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 =6
		 * ...
		 * 2 * 9 = 18
		 * 
		 */
		
		int a=2;
		System.out.println("< " + a + "단 >");
		for(int i=1; i<=9; i++) {
			
			System.out.println(a + " * " + i + " = " + (a*i));
		}
		
		
	}
}

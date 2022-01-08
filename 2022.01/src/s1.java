
public class s1 {

		public static void main(String[] args) {

			// **			i=0	공백=0, **
			//  **			i=1 공백=1, **
			//	 **
			//	  **
			//	   **
				
			int n=5;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				System.out.println("**");
			}
			
			//피라미드 모양 별찍기
			//	 *
			//	***
			// *****
			//*******
			
//			for(int i=0; i<4; i++) {
//				for(int j=3; j>=0; j--) {
//					System.out.println(" ");
//				}
//				System.out.println("*");
//			}
//			//--->실패..더 생각해보기
			
			
			//	  *
			//	 ***
			//  *****
			// *******
			//*********
			// 첫째줄 : 공백4칸 별1개
			// 둘째줄 : 공백3칸 별3개
			// 셋째줄 : 공백2칸 별5개
			// 넷째줄 : 공백1칸 별7개
			//다섯째줄 : 공백0칸 별9개
			
			//전체 줄 수(5줄이므로 i<5[위에서n=5초기화]) -> for문안에 줄바꿈출력(
			for(int i=0; i<n; i++) {
				//별 앞의 공백개수 4-3-2-1-0개 
				//i=0일때 공백 4칸 따라서 j<n-i 대신 j=1부터 
				for(int j=1; j<n-i; j++) {
					System.out.print(" ");
				}
				
				//별 개수 1-3-5-7-9 
				//i=0일때 별 1개 따라서 k<i*2+1
				for(int k=0; k<i*2+1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			//    *
			//   **
			//  ***
			// ****
			//*****
			//연습
			
			//전체줄 수 n (여기서 5)
			for(int i=0; i<n; i++) {
				//공백 4-3-2-1-0
				for(int j=1; j<n-i; j++) {
					System.out.print(" ");
				}
				
				//별 1-2-3-4-5
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}

}

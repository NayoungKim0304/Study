
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
			
			for(int i=0; i<4; i++) {
				for(int j=3; j>=0; j--) {
					System.out.println(" ");
				}
				System.out.println("*");
			}
		}

}

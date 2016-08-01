package Task6_basic_consructions;

public class Task6 {
	public static void main(String[] args) {
		 int[][]mas=create(7);
		 print1(mas);
		 System.out.println();
		 print2(mas);
		 System.out.println();
		 print3(mas);
		 System.out.println();
		 print4(mas);
		 System.out.println();
		 print5(mas);
	}
	public static int[][] create (int n){
		int [][]mas=new int [n][];
		for (int i=0; i<n; i++){
			mas[i]=new int[i+1];
		}
		
		for (int i=0; i<n; i++){
			for(int j=0; j<i+1; j++){
				mas[i][j]=0;
			}
		}
		return mas;
	}
	
	public static void  print1(int[][] mas){
		for (int i=0; i<mas.length; i++){
			for(int j=0; j<mas[i].length; j++){
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
	}
	//вариант 1
	/*
	 *        0
	 *      0 0
	 *    0 0 0  
	 */
	public static void  print2(int[][] mas){
		for (int i=0; i<mas.length; i++){
			for(int j=0; j<mas.length; j++){
				if(j<mas.length-mas[i].length){
					System.out.print("  ");
				 }
				else{System.out.print(mas[i][(mas.length)-j-1]+" ");}
			}
			System.out.println();
		}
	}
	//вариант 2
	/*
	 *        0
	 *      0 0
	 *    0 0 0  
	 */
		public static void  print3(int[][] mas){
			for (int i=0; i<mas.length; i++){
				for(int p=0; p<mas.length-mas[i].length; p++){
					System.out.print("  ");
				}
				for(int j=0; j<mas[i].length; j++){
					System.out.print(mas[i][j]+" ");
				}
				System.out.println();
			}
		}
	// 
		/*
		 * 0 0 0 0 
		 * 0 0 0
		 * 0 0
		 * 0
		*/
		public static void  print4(int[][] mas){
			for (int i=mas.length-1; i>=0; i--){
				for(int j=0; j<mas[i].length; j++){
					System.out.print(mas[i][j]+" ");
				}
				System.out.println();
			}
		}
		/*
		 *  0 0 0 0 
		 *    0 0 0
		 *      0 0
		 *        0
		 */
		public static void  print5(int[][] mas){
		for (int i=mas.length-1; i>=0; i--){
			for(int p=0; p<mas.length-mas[i].length; p++){
				System.out.print("  ");
			}
			for(int j=0; j<mas[i].length; j++){
				System.out.print(mas[i][j]+" ");
			}
			System.out.println();
		}
		}
}
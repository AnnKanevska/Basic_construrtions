package Task5_basic_consructions;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows in the array: ");
		System.out.println("");
		int n=in.nextInt();
		System.out.print("Enter the number of columns in the array: ");
		System.out.println("");
		int m=in.nextInt();
		boolean temp=true;
	int [][]mas=new int [n][];
	for(int i=0; i<n;i++){
		mas[i]=new int [m];
		}
	// инициализация
	for(int i=0; i<n;i++){
		for(int j=0; j<m;j++){
			mas[i][j]=(int)(Math.random()*100);
		}
	}
	do{
		System.out.println('\t'+"MENU");
		System.out.println("1 - Print an array ");
		System.out.println("2- Print even elements in even rows");
		System.out.println("3 - Print odd elements in odd columns");
		System.out.println("4 - The sum of the elements %7=0");
		System.out.println("5 - Multiplication of elements %3=0");
		System.out.println("Other - Exit  ");
		System.out.print("Enter the number:");
		int choice=in.nextInt();
		switch(choice) {
	    case 1:{
	    	System.out.println("Print an array "); 
	    	print(mas,n,m);
			System.out.println();
			break;}
	    case 2:{ 
	    	System.out.print("Even elements in even rows: "); 
	    	even(mas,n,m);
			System.out.println();
			break;}
	    case 3:{ 
	    	System.out.print("Odd elements in odd columns : ");
	    	uneven(mas,n,m);
			System.out.println();
			break;}
	    case 4:{ 
	    	System.out.print("The sum of the elements %7=0 = ");
	    	System.out.println(sum(mas,n,m));
			break;}
         case 5:{ 
        	 System.out.print("Multiplication of elements %3=0 = ");
        	 System.out.println(multiplication(mas,n,m));
			break;}
	    default:{System.out.println("--------------------------------------------выход--------------------------------------------");
			   temp=false;
	    }
		} 
		}while(temp==true);
	}
	public static void print(int mas [][],int n,int m ) {
		for(int i = 0; i<n; i++){
			Task4_basic_consructions.Task4.print1(mas[i],m);
		
		}
		System.out.println("");
		for(int i = n-1; i>=0; i--){
			Task4_basic_consructions.Task4.print2(mas[i],m);
			System.out.println("");
		}
	}
	public static void even(int mas [][],int n ,int m) {
		for(int i = 1; i<n; i+=2){
			Task4_basic_consructions.Task4.even(mas[i],m);
			//System.out.println("");
		}
	}
	public static void uneven(int mas [][],int n, int m ) {
		for(int i = 0; i<m; i+=2){
			for(int j = 0; j<n; j++){
				if(mas[j][i]%2!=0) System.out.print(mas[j][i]+",");
			}
		}
	}
	public static int sum(int mas [][],int n,int m ) {
		int sum=0;
		for(int i = 1; i<n; i+=2){
			sum+=Task4_basic_consructions.Task4.sum(mas[i],m);
		}
		return sum;
	}
	
	public static int multiplication (int mas [][],int n, int m ) {
		int mult=1;
		for(int i = 1; i<n; i+=2){
			mult*=Task4_basic_consructions.Task4.multiplication(mas[i],m);
		}
		return mult;
	}
}

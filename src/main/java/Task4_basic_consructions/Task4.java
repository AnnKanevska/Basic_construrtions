package Task4_basic_consructions;


import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		System.out.println("");
		int n=in.nextInt();
		boolean temp=true;
	int []mas=new int [n];
	for(int i=0; i<n;i++){
		mas[i]=(int)(Math.random()*100);
	}
	do{
		System.out.println('\t'+"MENU");
		System.out.println("1 - Print an array ");
		System.out.println("2- Print even elements");
		System.out.println("3 - Print odd elements");
		System.out.println("4 - The sum of the elements %7=0");
		System.out.println("5 - Multiplication of elements %3=0");
		System.out.println("Other - Exit  ");
		System.out.print("Enter the number:");
		int choice=in.nextInt();
		switch(choice) {
	    case 1:{
	    	System.out.println("Print an array "); 
	    	print1(mas,n);
	    	print2(mas,n);
			System.out.println();
			break;}
	    case 2:{ 
	    	System.out.print("Even elements : "); 
	    	even(mas,n);
			System.out.println();
			break;}
	    case 3:{ 
	    	System.out.print("Uneven elements : ");
	    	uneven(mas,n);
			System.out.println();
			break;}
	    case 4:{ 
	    	System.out.print("The sum of the elements %7=0 = ");
	    	System.out.println(sum(mas,n));
			break;}
         case 5:{ 
        	 System.out.print("Multiplication of elements %3=0 = ");
        	 System.out.println(multiplication(mas,n));
			break;}
	    default:{System.out.println("--------------------------------------------выход--------------------------------------------");
			   temp=false;
	    }
		} 
		}while(temp==true);
	
	
	}
	
	public static void print1(int mas [],int n ) {
		for(int i = 0; i<n; i++){
			System.out.print(mas[i]+",");
		}
		System.out.println("");
		
	}
	public static void print2(int mas [],int n ) {
		for(int i = n-1; i>=0; i--){
			System.out.print(mas[i]+",");
		}
	}
	public static void even(int mas [],int n ) {
		for(int i = 0; i<n; i++){
			if(mas[i]%2==0) System.out.print(mas[i]+",");
		}
	}
	public static void uneven(int mas [],int n ) {
		for(int i = 0; i<n; i++){
			if(mas[i]%2!=0) System.out.print(mas[i]+",");
		}
	}
	public static int sum(int mas [],int n ) {
		int sum=0;
		for(int i = 0; i<n; i++){
			if(mas[i]%7==0) sum+=mas[i];
		}
		return sum;
	}
	
	public static int multiplication (int mas [],int n ) {
		int m=1;
		for(int i = 0; i<n; i++){
			if(mas[i]%3==0) m*=mas[i];
		}
		return m;
	}
}


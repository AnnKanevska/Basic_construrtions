package Task1_basic_consructions;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean temp=true;
		do{
		System.out.println('\t'+"МЕНЮ");
		System.out.println("1 - вывод последовательности чисел от 0 до 100 определенной кратноси ");
		System.out.println("2 - сумма последовательности чисел от 0 до 100 определенной кратности");
		System.out.println("3 - разность сумм последовательности чисел от 0 до 100 определенной кратности ");
		System.out.println("4 - отношение последовательности чисел от 0 до 100 определенной кратности");
		System.out.println("другой символ - Выход  ");
		System.out.print("Введите выбранное действие:");
		String choice=in.next();
		switch(choice) {
	    case "1":{ 
	    	System.out.println('\t'+"Вывод последовательности чисел от 0 до 100 с определенной кратностью");
	    	System.out.print("Введие кратность числовой последовательности:");
			int n =in.nextInt();
			kratn(n);
			System.out.println();
			break;}
	    case "2":{ 
	    	System.out.println('\t'+"Cумма последовательности чисел от 0 до 100 определенной кратности");
	    	System.out.print("Введие кратность числовой последовательности:");
			int n =in.nextInt();
			
			System.out.println("Cумма = "+sum(n));
			break;}
	    case "3":{ 
	    	System.out.println('\t'+"Разность сумм последовательностей чисел от 0 до 100 определенной кратности");
	    	System.out.print("Введие кратность первой числовой последоватльности:");
			int n1 =in.nextInt();
			System.out.print("Введие кратность второй числовой последоватльности:");
			int n2 =in.nextInt();
			System.out.println("Разность сумм = "+raznsum(n1,n2));
			break;}
	    case "4":{ 
	    	System.out.println('\t'+"Отношение последовательностей чиселот 0 до 100 определенной кратности");
	    	System.out.print("Введие кратность первой числовой последоватльности:");
			int n1 =in.nextInt();
			System.out.print("Введие кратность второй числовой последоватльности:");
			int n2 =in.nextInt();
			System.out.println("Отношение последовательностей = "+ratio(n1,n2));
			break;}
	    default:{System.out.println("--------------------------------------------выход--------------------------------------------");
			   temp=false;
	    }
		} 
		}while(temp==true);
			
	}
	
	
	public static void kratn(int n){
		for (int i=0; i<=100; i++){
			if(i%n==0){System.out.print(i+",");}
		}
	}
	public static int sum(int n){
		int sum=0;
		for (int i=0; i<=100; i++){
			if(i%n==0){sum+=i;}
		}
		return sum;
	}
	public static int raznsum(int n,int k){
		return (sum(n)-sum(k));
	}
	public static double ratio(int n,int k){
		return(sum(n)/sum(k));
	}
}
	
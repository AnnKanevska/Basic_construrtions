package Task7_basic_consructions;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of rows in the array: ");
		System.out.println("");
		int n=in.nextInt();
		System.out.print("Enter the number of columns in the array: ");
		System.out.println("");
		int m=in.nextInt();
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
	print(mas);
	System.out.print("Enter the number of shifts:");
	int number=in.nextInt();
	print(right(mas,number));
	System.out.println("");
	print(left(mas,number));
	System.out.println("");
	print(down(mas,number));
	System.out.println("");
	print(up(mas,number));
	
	}
	
	
	
	//создание массива такого же размера
	 static public int[][] creat(int [][]mas){
		int [][]matr=new int [mas.length][];
		for(int i=0; i<mas.length;i++){
			matr[i]=new int [mas[i].length];
			}
		return matr;
	}
	 //печать двухмерного массива
	 static public void print(int [][]mas){
		for(int i=0; i<mas.length;i++){
			for (int j=0; j< mas[i].length;j++){
				System.out.print(mas[i][j]+" ");
			}
			System.out.println("");
		}	
	}
	 //механизм сдвига на n шагов вправо
	 static public int[] mover(int []mas, int n){
		 int []matr=new int [mas.length];
		 System.arraycopy (mas, mas.length-n, matr, 0, n);//массив-источник//с какой поз//массив назначения//начальное положение целевого массива//колв скопированных эл 
			System.arraycopy (mas, 0, matr, n, mas.length-n);
			return matr;
			}
	 
	 //правый сдвиг
	static public int[][] right(int [][]mas, int n) {
		int [][]matr=creat(mas);
		for(int i=0; i<mas.length;i++){
			//находим кол-во полезных перестановок
			if (n>=mas[i].length){
				n=n%mas[i].length;
			}
			if(n!=0){
				matr[i]=mover(mas[i],n);
			//System.arraycopy (mas[i], mas[i].length-n, matr[i], 0, n);//массив-источник//с какой поз//массив назначения//начальное положение целевого массива//колв скопированных эл 
			//System.arraycopy (mas[i], 0, matr[i], n, mas[i].length-n);
				}
			else matr=mas;
		}
		return matr;
	}
	
	//левый сдвиг
	static public int[][] left(int [][]mas, int n) {
		int [][]matr=creat(mas);
		for(int i=0; i<mas.length;i++){
			//находим кол-во полезных перестановок
			if (n>=mas[i].length){
				n=n%mas[i].length;
			}
			//для использования мехнизма сдвига вправо
			n=mas[i].length-n;
			if(n!=0){
				matr[i]=mover(mas[i],n);
				}
			else matr=mas;
		}
		return matr;
	}
	 //механизм сдвига на n шагов вниз
	 static public int[][] moved(int [][]mas, int n){
		 int [][]matr=creat(mas);
		 System.arraycopy (mas, mas.length-n, matr, 0, n);
			System.arraycopy (mas, 0, matr, n, mas.length-n);
			return matr;
			}
	//вниз
	static public int[][] down(int [][]mas, int n) {
		int [][]matr=creat(mas);
					//находим кол-во полезных перестановок
			if (n>=mas.length){
				n=n%mas.length;
			}
			if(n!=0){
				matr=moved(mas,n);
				}
			else matr=mas;
		return matr;
	}
	
	//вверх
	static public int[][] up(int [][]mas, int n) {
		int [][]matr=creat(mas);
					//находим кол-во полезных перестановок
			if (n>=mas.length){
				n=n%mas.length;
			}
			n=mas.length-n;
			if(n!=0){
				matr=moved(mas,n);
				}
			else matr=mas;
		return matr;
	}

}
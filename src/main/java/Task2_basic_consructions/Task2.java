package Task2_basic_consructions;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;
		do{
		System.out.print("Enter the number.");
		int number=in.nextInt();
		int intpart=(int)(number/10);
		int fraction=number%10;
		if (number<20){System.out.print( tostring(number));}
		else {
			System.out.print(tostring(intpart*10)); 
			if(fraction!=0){System.out.print(" "+tostring(fraction));}
		}
		System.out.println("");
		System.out.println("Type 1 to continue");
		System.out.println("Type else to exit");
		 choice=in.nextInt();
		}while(choice==1);
	}
	public static String tostring (int n){
		String str="";
		switch(n) {
	    case 0:{return "ноль";
	       }
	    case 1:{return "один";
	    }
	    case 2:{return "два";
	    }
	    case 3:{return "три";
	    }
	    case 4:{return "четыре";
	    }
	    case 5:{return "пять";
	    }
	    case 6:{return "шесть";
	    }
	    case 7:{return "семь";
	    }
	    case 8:{return "восемь";
	    }
	    case 9:{return "девять";
	    }
	    case 10:{return "десять";
	    }
	    case 11:{return "одиннадцать";
	    }
	    case 12:{return "двенадцать";
	    }
	    case 13:{return "тринадцать";
	    }
	    case 14:{return "четырнадцать";
	    }
	    case 15:{return "пятнадцать";
	    }
	    case 16:{return "шестнадцать";
	    }
	    case 17:{return "сeмнадцать";
	    }
	    case 18:{return "восемнадцать";
	    }
	    case 19:{return "девятнадцать";
	    }
	    case 20:{return "двадцать";
	    }
	    case 30:{return "тридцать";
	    }
	    case 40:{return "сорок";
	    }
	    case 50:{return "пятьдесят";
	    }
	    case 60:{return "шестьдесят";
	    }
	    case 70:{return "семьдесят";
	    }
	    case 80:{return "восемьдесят";
	    }
	    case 90:{return "девяносто";
	    }
	    case 100:{return "сто";
	    } 
	    default: {return "";}
	}
		
   }
	
}

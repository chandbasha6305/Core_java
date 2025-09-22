package Core_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class expection {
	public static void main(String[] args) {
		int f=0;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the first number");
			int n=sc.nextInt();
			System.out.println("enter the second number");
			int n2=sc.nextInt();
		
			f=n/n2;
			System.out.println(f);
		}
		catch(ArithmeticException r) {
			System.out.println("your entering in denomaitor in zero plz enter valid input ");
		}
		catch(InputMismatchException g) {
			System.out.println("your entering only number data plz check your input");
		}
		//catch(Exception e) {
		//	System.out.println("your entering invalid number");
		//}
	}	

}

package DigitBasedProgram;

import java.util.Scanner;

public class Program1 {
	public static void printEachDigit(int n) {
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			n = n/10;	
		}	
	}
	
	public static void printEvenDigit(int n) {
	
		while(n>0) {
			int rem = n%10;
			if(rem % 2 ==0) {
				System.out.println(rem);
				
			}
			n = n/10;
		}
		
	}
	
	
	public static void printOddDigit(int n) {
		while(n>0) {
			int rem = n %10;
			if(rem %2 != 0) {
				System.out.println(rem);
			}
			n = n/10;
		}
		
	}
	public static void greaterThanFive(int n) {
		while(n>0) {
			int rem = n%10;
			if(rem >5) {
				System.out.println(rem);
			}
			n = n/10;
		}
	}
	public static void  countEvenDigit(int n) {
		int count =0;
		while(n>0) {
			int rem = n %10;
			if (rem %2 == 0) {
				count = count +1;
			}
			
			n = n/10;
			
		}
		System.out.println("the no of Even is"+count);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
			int n = sc.nextInt();
		 //printEachDigit(n);
          //printEvenDigit(n);
			//printOddDigit(n);
			//greaterThanFive(n);
			countEvenDigit(n);
		
		
		
		
		
		
		sc.close();
	}

}

package Recursion;

import java.util.Scanner;

public class CheckPlaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		checkPlaindrome(n);
		if(n == rev) {
			System.out.println("It is plaindrome Number");
		}
		else {
			System.out.println("It is not  a Plaindrome Number");
		}
		
		
		sc.close();
		

	}
	
	static int rem = 0;
	static int rev =0;
	public static void checkPlaindrome(int n) {
		 
		
		if(n>0) {
			rem =n%10;
			rev =rev*10+rem;
			n=n/10;
			checkPlaindrome(n);
		}
		
		
	}

}

package StringBasedProgram;

import java.util.Scanner;

public class StringProgram {

	
	public static void printEachString(String s1) {
		int i = 0;
		while(i<s1.length()) {
			System.out.println(s1.charAt(i));
			i++;
		}
	}
	
	 public static void printEachReverseString(String s1) {
		 int i = s1.length()-1;
		 while(i>=0) {
			 System.out.println(s1.charAt(i));
			 i--;
		 }
		 
		 
	 }
	 public static void printReverseString(String s1) {
		 int i = 0;
		 String rev ="";
		 while(i<s1.length()) {
			 rev = s1.charAt(i)+rev;
			 i++;
			 
		 }
		 System.out.println("The reverse is "+rev);
		 
	 }
	/* public static void checkStringIsPlaindrome(String s1) {
		 String orgStr = s1;
		 int i = 0;
		 String rev = "";
		 while(i<s1.length()) {
			 rev = s1.charAt(i)+rev;
			 i++;
		 }
		 if(orgStr.equalsIgnoreCase(rev)) {
			 System.out.println("It is Plaindrome String");
		 }
		 else {
			 System.out.println("it is not Plainddrome String");
		 }
	 }
	 */
//	--> method 2
	 /*public static boolean checkStringIsPlaindrome(String s1) {
		 s1 = s1.toLowerCase();
		 int mid = s1.length()/2;
		 int i =0;
		 while(i<mid) {
			 if(!(s1.charAt(i)==s1.charAt(s1.length()-1-i))){
				 return false;
			 }
			 i++;
			
			 
		 }
		 return true;
	 }
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1 = sc.nextLine();
		
		//printEachString(s1);
		//printEachReverseString(s1);
		//printReverseString(s1);
		//checkStringIsPlaindrome(s1);
		/*if(checkStringIsPlaindrome(s1)) {
			System.out.println("it is plaindrome");
		}
		else {
			System.out.println("it is not plaindrome");
		}*/
		
		sc.close();
		

	}

}

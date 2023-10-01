package Strings;

import java.util.Scanner;

public class StringPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		System.out.println("enter sentence to check");
		String s1=sc.next();
		 boolean isPresent = s.contains(s1);

	        // Display the result
	        if (isPresent) {
	            System.out.println("'" + s1 + "' is present in the main string.");
	        } else {
	            System.out.println("'" + s1 + "' is not present in the main string.");
	        }
	}
	public static boolean isPresent(String s, String s1) {
        return s.contains(s1);
    }

}

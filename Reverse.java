package Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
		if(s.equals(s1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palin");
		}
		

	}

}

package Strings;

import java.util.Scanner;

public class PalinWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		//String s=sc.nextLine();
		String s="abjhi121ihabccba";
		String s1="";
		for(int i=0;i<s.length()-1;i++) {
			s1=s.charAt(i)+"";
			for(int j=i+1;j<s.length();j++) {
				s1=s1+s.charAt(j);
				if(palin(s1)) {
					System.out.println(s1);
				}
			}
		}

	}

	public static boolean palin(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
			
		return rev.equals(s);
	}

}

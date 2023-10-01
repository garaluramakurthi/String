package Strings;

import java.util.Scanner;

public class ReverseEveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		String s1="";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			s1=s1+" "+reverse(str[i]);
		}
		System.out.println(s1);
	}
	public static String reverse(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		return s1;
	}

}

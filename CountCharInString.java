package Strings;

import java.util.Scanner;

public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter words");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			int c=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					c++;
				}
			}
			if(s1.indexOf(ch)==-1) {
				s1=s1+ch+c;
			}
		}
		System.out.println(s1);

	}

}

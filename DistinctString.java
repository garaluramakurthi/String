package Strings;

import java.util.Scanner;

public class DistinctString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j) && i>j) {
					break;
				}if(s.charAt(i)==s.charAt(j)) {
					s1=s1+s.charAt(i);
					break;
				}
			}
		}System.out.println(s1);

	}

}

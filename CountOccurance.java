package Strings;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String s=sc.next();
		String s1=" ";
		for(int i=0;i<s.length();i++) {
			int c=0;
			for(int j=0;j<s.length();j++) {
				if(i>j && s.charAt(i)==s.charAt(j)) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}
			
			
		if(c>0 ) {
			System.out.println(s.charAt(i)+" occurance "+c);
		}
		}
		
		
	}

}

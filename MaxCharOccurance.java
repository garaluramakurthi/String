package Strings;

import java.util.Scanner;

public class MaxCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stream of characters");
		String s=sc.next();
		System.out.println(countMaxOccurance(s));

	}

	public static String countMaxOccurance(String s) {
		String result="";
		int c=0;
		int max=0;
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(s.charAt(i)!=' ') {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j) && i>j) {
						count++;
					}
			}
				if(max<count) {
					max=count;
					result+=s.charAt(i);
				}
				}
		}
		return result;
		
	}

}

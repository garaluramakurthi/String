package Strings;

import java.util.Scanner;

public class SwapFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		String s=sc.next();
		System.out.println(swap(s));

	}

	public static String swap(String s) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				ans+=s.charAt(s.length()-1);
			}else if(i==s.length()-1){
				ans+=s.charAt(0);
			}else
			{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}

}

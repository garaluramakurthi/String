package Strings;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words");
		String s=sc.nextLine();
		String s1=" ";
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
			s1=a[i]+" "+s1;
		}
		System.out.println(s1);
	}

}

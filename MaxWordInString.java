package Strings;

import java.util.Scanner;

public class MaxWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String[] c=s.split(" ");
		String m=c[0];
		//int max=c[0].length();
		int max=m.length();
		for(int i=0;i<c.length;i++) {
			if(c[i].length()>max) {
				max=c[i].length();
				m=c[i];
			}
		}System.out.println(m);
  
	}
	

}

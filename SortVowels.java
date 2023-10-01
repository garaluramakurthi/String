package Strings;

import java.util.Scanner;

public class SortVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sentence");
		String s=sc.nextLine();
		String s1="aeiouAEIOU";
		String vowel="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s1.indexOf(ch)!=-1) {
				vowel=vowel+ch;
			}
		}
		System.out.println(vowel);
		char c[]=vowel.toCharArray();
		for(int i=0;i<c.length;i++) {
			int min=i;
			for(int j=i+1;j<c.length;j++) {
				if(c[min]>c[j]) {
					min=j;
				}
			}
			char temp=c[min];
			c[min]=c[i];
			c[i]=temp;
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}

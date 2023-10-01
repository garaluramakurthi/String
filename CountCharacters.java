package Strings;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.next();
		int cu=0,cl=0,cd=0,cs=0;

		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				cu++;
			}else if(ch>='a' && ch<='z') {
				cl++;
			}else if(ch>='0' && ch<='9') {
				cd++;
			}else {
				cs++;
			}
		}
		System.out.println(cu);
		System.out.println(cl);
		System.out.println(cd);
		System.out.println(cs);

	}

}

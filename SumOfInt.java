package Strings;

import java.util.Scanner;

public class SumOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string with digits");
		String s1=sc.next();
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9') {
				int sum1=Integer.parseInt(ch+"");
				sum+=sum1;
			}
		}System.out.println(sum);

	}

}

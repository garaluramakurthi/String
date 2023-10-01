package Strings;

import java.util.Scanner;

public class PercentageOfCharDigitSpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println(percentages(s));

	}

	public static String percentages(String s) {
		// TODO Auto-generated method stub
		int spe=0,num=0,ch=0;
		float l=s.length();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				if((s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='a' && s.charAt(i)<='z')){
					ch++;
				}else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					num++;
				}else {
					spe++;
				}
			}
		}
		float c=(ch/l)*100;
		float d=(num/l)*100;
		float sp=(spe/l)*100;
		return "character :"+ch+" number :"+num+" spechar :"+spe;
	}

}

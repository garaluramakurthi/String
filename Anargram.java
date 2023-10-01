package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anargram {
	public static boolean areAnagrams(String str1, String str2) {
//	        // Remove spaces and convert to lowercase to make the comparison case-insensitive
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

//	        // Check if the lengths of the two strings are equal
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert the strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

//	        // Compare the sorted character arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
//	public static String checkAnagram(String str,String str2) {
//		char[] arr = new char[str.length()]; 
//		//char[] arr = str.toCharArray();
//		char[] arr2 = new char[str.length()];
//		for(int i=0;i<str.length();i++) {
//		arr[i]=str.charAt(i);
//		}
//		for(int i=0;i<str2.length();i++) {
//		arr2[i]=str2.charAt(i);
//		}
//		if(str.length()!=str2.length()) {
//		return "They have different size can't be Anagram";
//		}
//		else {
//			for(int i=0;i<str.length();i++) {
//				for(int j=0;j<str.length();j++) {
//				if(i!=j && arr[i]>arr[j]) {
//				char ch = arr[i];
//				arr[i]=arr[j];
//				arr[j]=ch;
//				}
//				if(i!=j && arr2[i]>arr2[j]) {
//				char ch = arr2[i];
//				arr2[i]=arr2[j];
//				arr2[j]=ch;
//				}
//				}
//				}
//				}
//				for(int i=0;i<str.length();i++) {
//				if(arr[i]!=arr2[i]) {
//					return"Not Anagram";
//				}}
//				return "They are Anagram.";
//	}
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter First String: ");
//	String str = sc.nextLine();
//	System.out.println("Enter Second String: ");
//	String str2 = sc.nextLine();
//	System.out.println(checkAnagram(str,str2));
//	}
}



	   
	


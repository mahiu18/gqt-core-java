package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class Vowelcount2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		int cap_vowel_count=0;
		int small_vowel_count=0;
		   sc.close();
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' ) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' 
				|| str.charAt(i)=='O' || str.charAt(i)=='U') {
					cap_vowel_count++;
				}
		    }
			if(str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
				|| str.charAt(i)=='o' || str.charAt(i)=='u') {
					small_vowel_count++;
				}
		    }
		}
		System.out.println("The total small vowels in the string is :"+small_vowel_count);
		System.out.println("The total capital vowels in the string is :"+cap_vowel_count);
    }
}

package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class Vowelcount5 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int sum1=0;
    	int sum2=0;
    	long pro=1;
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' 
				|| str.charAt(i)=='O' || str.charAt(i)=='U') {
					sum1+=str.charAt(i);
				}else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
						|| str.charAt(i)=='o' || str.charAt(i)=='u') {
					sum2+=str.charAt(i);
				}else {
					 pro*=str.charAt(i);
				 }
		    }
		}
		System.out.println("The sum of all capital vowels is "+sum1);
		System.out.println("The sum of all smaller vowels is "+sum2);
		System.out.println("The product of all consonents is "+pro);
		sc.close();
	}
}

package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class Vowelcount3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' ) {
				if(str.charAt(i)=='A' || str.charAt(i)=='a' ) {
					str=str.replace(str.charAt(i),'$');	
				}
				if(str.charAt(i)=='E' || str.charAt(i)=='e' ) {
					str=str.replace(str.charAt(i),'#');	
				}
				if(str.charAt(i)=='I' || str.charAt(i)=='i' ) {
					str=str.replace(str.charAt(i),'*');	
				}
				if(str.charAt(i)=='O' || str.charAt(i)=='o' ) {
					str=str.replace(str.charAt(i),'@');	
				}
				if(str.charAt(i)=='U' || str.charAt(i)=='u' ) {
					str=str.replace(str.charAt(i),'&');	
				}
				
			}
		}
		System.out.println(str);
		sc.close();
	} 
}


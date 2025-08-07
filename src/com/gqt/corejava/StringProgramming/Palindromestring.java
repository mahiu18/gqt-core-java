package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		String res="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		System.out.println("The reverse of given string is :"+res);
		sc.close();
		if(str.equals(res)==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}

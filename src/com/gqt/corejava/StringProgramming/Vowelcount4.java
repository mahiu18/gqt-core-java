package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class Vowelcount4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			sum+=str.charAt(i);
		}
		System.out.println("Sum = "+sum);
		sc.close();

	}

}

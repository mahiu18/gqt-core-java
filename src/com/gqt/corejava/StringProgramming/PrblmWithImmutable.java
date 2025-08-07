package com.gqt.corejava.StringProgramming;

import java.util.Scanner;

public class PrblmWithImmutable{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1 :");
		String str1=sc.next();
		System.out.println("Enter the string 2 :");
		String str2=sc.next();
		
		str1= str1.concat(str2);
		System.out.println(str1);
		sc.close();
	}

}

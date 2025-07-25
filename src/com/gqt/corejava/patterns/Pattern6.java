package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("1"+" ");
		}
		sc.close();
	}

}

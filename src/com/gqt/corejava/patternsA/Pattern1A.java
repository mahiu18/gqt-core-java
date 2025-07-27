package com.gqt.corejava.patternsA;

import java.util.Scanner;

public class Pattern1A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j<n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}

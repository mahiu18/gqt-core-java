package com.gqt.corejava.patternsA;

import java.util.Scanner;

public class Pattern4A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j<n;j++){
				if((i+j)%2==0) {
					System.out.print("0"+" ");
				}
				else {
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}  
		sc.close();
	}

}

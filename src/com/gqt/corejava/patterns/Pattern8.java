package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

/*row(i)     column(*)(j)
 1                 5            
 2                 5
 3                 5
 4                 5
 5                 5
 */


package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(m+"\t");
				m++;
			}
			System.out.println();
		}
		sc.close();
	}
}

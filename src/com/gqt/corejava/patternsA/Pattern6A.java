package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern6A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++){
				  System.out.print("  ");
			 }
			 for(int k=1;k<=2*i-1;k++) {
			     System.out.print(k+" ");
			 }
			 System.out.println();
		}  
		sc.close();
	}
}

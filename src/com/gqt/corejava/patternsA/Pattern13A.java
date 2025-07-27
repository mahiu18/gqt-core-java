package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern13A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the count: ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	     for(int j=1;j<=n-i;j++){
	           System.out.print("  ");
	     }
	     char ch = (char)(64 + i);  // A=65, B=66, etc.
	     for(int k=1;k<=2*i-1;k++){
	           System.out.print(ch + " ");
	     }
         System.out.println();
	}
    sc.close();
	}
}

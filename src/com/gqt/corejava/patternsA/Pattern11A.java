package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern11A {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the count: ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++){
	     for(int j=1;j<=n-i;j++) {
	          System.out.print(" ");
	     }
	     for(int k=1;k<=i;k++){
	          System.out.print("* ");
	     }
	     System.out.println();
	}
	sc.close();
	}
}

package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern9A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the count : ");
	int n=sc.nextInt();
	// Top
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
	    }
		System.out.print(i);
	    if(i!=1){
	    	for(int j=1;j<=2*i-3;j++){
	    		System.out.print(" ");
	        }
	        System.out.print(i);
	        }
	    System.out.println();
	 }
	 // Bottom
	 for(int i=n-1;i>=1;i--){
		 for(int j=1;j<=n-i;j++){
			 System.out.print(" ");
			 }
		 System.out.print(i);
		 if(i!=1){
			 for(int j=1;j<=2*i-3;j++){
				 System.out.print(" ");
	         }
			 System.out.print(i);
			 }
		 System.out.println();
	     }
	     sc.close();
	}
}

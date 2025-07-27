package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern15A {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the count: ");
	     int n = sc.nextInt();
	     for(int i=0;i<n;i++){
	     // Print leading spaces
	         for(int s=0;s<n-i-1;s++){
	             System.out.print("  ");
	         }
	         // Print decreasing numbers from i to 0
	         for(int j=i;j>=0;j--){
	              System.out.print(j+" ");
	         }
	         // Print increasing numbers from 1 to i
	         for(int j=1;j<=i;j++){
	            System.out.print(j+" ");
	         }
	         System.out.println();
	        }
	        sc.close();
	}
}

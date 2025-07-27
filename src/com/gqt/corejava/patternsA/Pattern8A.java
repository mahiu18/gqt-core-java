package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern8A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			 int p=1;
			 for(int j=i;j<=n;j++){
				  System.out.print("  ");
			 }
			 for(int j=1;j<i;j++){
				  System.out.print(p+++" ");
			 }
			 for(int j=1;j<=i;j++){
				  System.out.print(p--+" ");
			 }
			 System.out.println();
		}  
		for(int i=1;i<=n-1;i++){
            int p=1;
            for(int j=1;j<=i+1;j++){
                System.out.print("  ");
            }
            for (int j=i;j<n-1;j++){
                System.out.print(p++ + " ");
            }
            for (int j=i;j<=n-1;j++){
                System.out.print(p-- + " ");
            }
            System.out.println();
        }
		sc.close();
	}
}

package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern12A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            // Print spaces
            for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
            }
            // Print stars
            for(int k=1;k<=(2*i-1);k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
	}
}

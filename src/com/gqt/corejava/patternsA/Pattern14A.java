package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern14A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char current = 'A';
        for (int i=1;i<=n;i++){
            int count=2*i-1;
            // Print leading spaces
            for (int s=1;s<=n-i;s++) {
                System.out.print("  ");
            }
            // Store the starting character for this row
            char ch=(char)(current+count-1);
            // Print characters in reverse
            for (int j=1;j<=count;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}


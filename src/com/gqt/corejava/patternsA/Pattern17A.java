package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern17A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // Print spaces
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            // Print increasing characters: A to (A + i - 1)
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            // Print decreasing characters: (A + i - 2) to A
            for(int j=i-2;j>=0;j--){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
        sc.close();
	}
}

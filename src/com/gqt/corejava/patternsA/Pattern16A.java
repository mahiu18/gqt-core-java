package com.gqt.corejava.patternsA;
import java.util.Scanner;
public class Pattern16A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // Print spaces
            for(int s=0;s<n-i-1;s++) {
                System.out.print("  ");
            }
            // Print decreasing characters from (char)('A' + i) to 'B'
            for(char ch=(char)('A'+i);ch>'A';ch--){
                System.out.print(ch+" ");
            }
            // Print increasing characters from 'A' to (char)('A' + i)
            for(char ch ='A';ch<=(char)('A'+i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
	}
}

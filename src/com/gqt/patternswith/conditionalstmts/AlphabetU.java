/**
 * 
 */
package com.gqt.patternswith.conditionalstmts;

import java.util.Scanner;

/**
 * 
 */
public class AlphabetU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||j==(n-1)|| i==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
        sc.close();
	}

}

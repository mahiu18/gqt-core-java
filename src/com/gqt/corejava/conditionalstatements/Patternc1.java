/**
 * 
 */
package com.gqt.corejava.conditionalstatements;

import java.util.Scanner;
/*
 * # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 */

/**
 * @author mahiu
 * @category patterns
 * @description : This is an example for conditional pattern
 */
public class Patternc1 {

	/**
	 * @param args
	 * @description : This contain source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		//rows
		for(int i=0;i<n;i++) {
			//columns
			for(int j=0;j<n;j++) {
				//condition for where it need to be print # and -
				if(i==0||i==n-1||j==0||j==n-1) {
					System.out.print("# ");
				}else {
					System.out.print("- ");
				}
			}
			//next line 
			System.out.println();
		}
		sc.close();		
	}

}

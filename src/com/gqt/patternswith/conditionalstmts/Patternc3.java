/**
 * 
 */
package com.gqt.patternswith.conditionalstmts;

import java.util.Scanner;
/*
 * - - - - - #
 * - - - - # # #
 * - - - # # # # #
 * - - # # # # # # #
 * - # # # # # # # # #
 */

/**
 * @author mahiu
 * @category patterns
 * @description : This is an example for pyramid pattern
 */
public class Patternc3 {

	/**
	 * @param args
	 * @description : This contain source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count : ");
		int n=sc.nextInt();
		//row
		for(int i=1;i<=n;i++) {
			//to print inverted right angle traingle 
			for(int j=i;j<=n;j++) {
				System.out.print("- ");
			}
			//to print pyramid 
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		sc.close();	
	}
}


/*
 * 1#=row no:1-----2*1-1=1
 * 3#=row no:2-----2*2-1=3
 * 5#=row no:3-----2*3-1=5
 * 7#=row no:4-----2*4-1=7
 * 9#=row no:5-----2*5-1=9
 *                 (2*i-1)
 */

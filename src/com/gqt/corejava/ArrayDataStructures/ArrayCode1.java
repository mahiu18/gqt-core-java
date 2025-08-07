/**
 * 
 */
package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

/**
 * 
 */
public class ArrayCode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student count : ");
		int n=sc.nextInt();
		//Creating the array to store n students marks 
		int arr[]=new int[n];
		//collecting & storing marks of n students 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no :"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Created");
		System.out.println("..................");
		//display marks stored inside the array
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of the student no :"+(i+1)+" is = "+arr[i]);
		}	
		sc.close();
	}
}

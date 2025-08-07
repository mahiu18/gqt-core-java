/**
 * 
 */
package com.gqt.corejava.ArrayDataStructures;

/**
 * 
 */
import java.util.Scanner;
class ArrayOperations1D{
	int arr[];
	Scanner sc=new Scanner(System.in);
	void CreateArray() {
		System.out.println("Enter the student count : ");
	    int n=sc.nextInt();
		//Creating the array to store n students marks 
		arr=new int[n];
		System.out.println(" Array Created");
		System.out.println("......................");
	}
	void Collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no :"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("......................");
	}
	void Displaydata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of the student no :"+(i+1)+" is ="+arr[i]);
		}
	}		
}
public class ArrayCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayOperations1D ao=new ArrayOperations1D();
		ao.CreateArray();
		ao.Collectdata();
		ao.Displaydata();
	}
}

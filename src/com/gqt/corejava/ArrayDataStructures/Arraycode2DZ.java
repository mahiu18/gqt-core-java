package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

class Arrayoperations2DJ{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	void createdata() {
		System.out.println("Enter class count :");
		int cls=sc.nextInt();
		arr=new String[cls][];
		//collect student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of students inside the class:"+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
		System.out.println("Array is Created ");
		System.out.println("......................");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no :"+(j+1));
				arr[i][j]=sc.next();
			}
		}
	}
	void displaydata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The name of student no :"+(j+1)+" is = "+ arr[i][j]);
			}
		}
		System.out.println("......................");
	}
}
public class Arraycode2DZ {

	public static void main(String[] args) {
		Arrayoperations2DJ ao=new Arrayoperations2DJ();
		ao.createdata();
		ao.collectdata();
		ao.displaydata();
	}

}

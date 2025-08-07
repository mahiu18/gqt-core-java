package com.gqt.corejava.ArrayDataStructures;

import java.util.Scanner;

class Arrayoperations3D{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	void createdata() {
		System.out.println("Enter school count :");
		int sch=sc.nextInt();
	    System.out.println("Enter class count in each school :");
		int cls=sc.nextInt();
		System.out.println("Enter student count in each class :");
		int stu=sc.nextInt();
		
		arr=new String[sch][cls][stu];
		System.out.println("Array is Created ");
		System.out.println("......................");
	}
	void collectdata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no :"+(j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no :"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println("Data is collected ");
		System.out.println("......................");
	
	}
	void displaydata() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student in school no :"+(i+1)+" is = "+ arr[i][j][k]);
				}
			}
		}
		System.out.println("......................");
	}
}
public class Arraycode3D {

	public static void main(String[] args) {
		Arrayoperations3D ao=new Arrayoperations3D();
		ao.createdata();
		ao.collectdata();
		ao.displaydata();
	}

}

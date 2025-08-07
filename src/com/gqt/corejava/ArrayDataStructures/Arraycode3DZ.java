package com.gqt.corejava.ArrayDataStructures;
import java.util.Scanner;
class Arrayoperations3DJ {
	String arr[][][];
	Scanner sc = new Scanner(System.in);
    //Creating array 
	void createdata() {
		System.out.println("Enter school count :");
		int sch=sc.nextInt();
		arr=new String[sch][][];
		
		//collect class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside School no :"+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		//collecting student count 
		for(int i=0;i<arr.length;i++) {
			System.out.println(" Inside school no :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count inside class no :"+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}
		System.out.println("Array is Created ");
		System.out.println("......................");
	}

	void collectdata() {
		for (int i=0;i<arr.length;i++) {
			System.out.println("Inside school no :"+(i+1));
			for (int j=0;j<arr[i].length;j++) {
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
			System.out.println("Inside school no :" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class no :" + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The name of student in school no :" + (i+ 1)+" is = " + arr[i][j][k]);
				}
			}
		}
		System.out.println("......................");
	}
}

public class Arraycode3DZ {

	public static void main(String[] args) {
		Arrayoperations3DJ ao = new Arrayoperations3DJ();
		ao.createdata();
		ao.collectdata();
		ao.displaydata();
	}

}
